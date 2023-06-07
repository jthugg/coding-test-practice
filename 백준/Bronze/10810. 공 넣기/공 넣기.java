import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[scanner.nextInt() + 1];
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int value = scanner.nextInt();
            while (start <= end) {
                basket[start] = value;
                start++;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < basket.length; i++) {
            answer.append(basket[i]).append(" ");
        }
        System.out.println(answer);
    }
}