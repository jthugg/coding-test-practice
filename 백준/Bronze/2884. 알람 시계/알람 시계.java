import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime
                .of(scanner.nextInt(), scanner.nextInt())
                .minusMinutes(45);
        scanner.close();
        
        System.out.println(time.getHour() + " " + time.getMinute());
    }
}