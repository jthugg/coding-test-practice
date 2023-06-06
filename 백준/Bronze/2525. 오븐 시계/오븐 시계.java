import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime result = LocalTime
                .of(scanner.nextInt(), scanner.nextInt())
                .plusMinutes(scanner.nextInt());
        System.out.println(result.getHour() + " " + result.getMinute());
    }
}