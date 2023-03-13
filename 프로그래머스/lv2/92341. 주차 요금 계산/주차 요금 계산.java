import java.time.LocalTime;
import java.time.Duration;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    
    Map<String, Car> cars;
    
    public Solution() {
        cars = new TreeMap<>();
    }
    
    public int[] solution(int[] fees, String[] records) {
        
        for (String record : records) {
            String[] data = record.split(" ");
            if (data[2].equals("IN")) {
                store(data);
                continue;
            }
            deposit(data);
        }
        
        int[] answer = new int[this.cars.size()];
        int count = 0;

        for (Map.Entry<String, Car> entry : this.cars.entrySet()) {
            if (!entry.getValue().isGone()) {
                entry.getValue().out("23:59");
            }
            answer[count] = calculate(fees, entry.getValue().getDuration());
            count++;
        }
        
        return answer;
    }
    
    private void store(String[] data) {
        
        Car car = cars.get(data[1]);
        
        if (car == null) {
            car = new Car();
            this.cars.put(data[1], car);
        }
        
        car.in(data[0]);
    }
    
    private void deposit(String[] data) {
        cars.get(data[1]).out(data[0]);
    }
    
    private int calculate(int[] fees, int duration) {
        
        duration -= fees[0];
        
        if (duration < 0) {
            return fees[1];
        }
        
        if (duration % fees[2] == 0) {
            return fees[1] + (duration / fees[2] * fees[3]);
        }
        
        return fees[1] + (duration / fees[2] * fees[3]) + fees[3];
    }
}

class Car {

    private LocalTime lastIn;
    private int duration;
    
    public Car() {}
    
    public void in(String time) {
        this.lastIn = LocalTime.parse(time);
    }
    
    public void out(String time) {
        this.duration += (int) Duration.between(lastIn, LocalTime.parse(time)).getSeconds() / 60;
        this.lastIn = null;
    }
    
    public boolean isGone() {
        return this.lastIn == null;
    }
    
    public int getDuration() {
        return this.duration;
    }
}