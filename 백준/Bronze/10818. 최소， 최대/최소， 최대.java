import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int now = 0;
        for (int i = 0, number = 0; i < count; i++) {
            now = scanner.nextInt();
            if (max < now) {
                max = now;
            }
            if (min > now) {
                min = now;
            }
        }
        System.out.println(min + " " + max);
    }
}