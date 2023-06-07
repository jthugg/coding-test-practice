import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[scanner.nextInt() + 1];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i;
        }
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int temp = basket[b];
            basket[b] = basket[a];
            basket[a] = temp;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < basket.length; i++) {
            answer.append(basket[i]).append(" ");
        }
        System.out.println(answer);
    }
}