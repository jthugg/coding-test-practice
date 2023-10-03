import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] parkData = getParkData(park);
        
        Dog dog = new Dog(park);
        
        for (String route : routes) {
            if (dog.checkMovement(parkData, route)){
                dog.move(route);
            }
        }
        
        return dog.getCurrentLocation();
    }
    
    private String[][] getParkData(String[] park) {
        String[][] data = new String[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            data[i] = park[i].replaceAll("S", "O").split("");
        }
        return data;
    }
}

class Dog {

    private int[] currentLocation;
    
    public Dog(String[] park) {
        this.currentLocation = findStart(park);
    }
    
    private int[] findStart(String[] park) {
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    return new int[] {i, j};
                }
            }
        }
        throw new RuntimeException();
    }
    
    public int[] getCurrentLocation() {
        return this.currentLocation;
    }
    
    public void move(String movement) {
        String direction = movement.substring(0, 1);
        int count = Integer.parseInt(movement.substring(2));
        
        if (direction.equals("N")) {
            this.currentLocation[0] -= count;
        }
        if (direction.equals("S")) {
            this.currentLocation[0] += count;
        }
        if (direction.equals("E")) {
            this.currentLocation[1] += count;
        }
        if (direction.equals("W")) {
            this.currentLocation[1] -= count;
        }
    }
    
    public boolean checkMovement(String[][] parkData, String movement) {
        String direction = movement.substring(0, 1);
        int count = Integer.parseInt(movement.substring(2));
        
        if (direction.equals("N")) {
            for (int i = 1; i <= count; i++) {
                int row = this.currentLocation[0] - i;
                int col = this.currentLocation[1];
                if (row < 0 || parkData[row][col].equals("X")) {
                    return false;
                }
            }
            return true;
        }
        if (direction.equals("S")) {
            for (int i = 1; i <= count; i++) {
                int row = this.currentLocation[0] + i;
                int col = this.currentLocation[1];
                if (row >= parkData.length || parkData[row][col].equals("X")) {
                    return false;
                }
            }
            return true;
        }
        if (direction.equals("E")) {
            for (int i = 1; i <= count; i++) {
                int row = this.currentLocation[0];
                int col = this.currentLocation[1] + i;
                if (col >= parkData[row].length || parkData[row][col].equals("X")) {
                    return false;
                }
            }
            return true;
        }
        if (direction.equals("W")) {
            for (int i = 1; i <= count; i++) {
                int row = this.currentLocation[0];
                int col = this.currentLocation[1] - i;
                if (col < 0 || parkData[row][col].equals("X")) {
                    return false;
                }
            }
            return true;
        }
        throw new RuntimeException();
    }

}
