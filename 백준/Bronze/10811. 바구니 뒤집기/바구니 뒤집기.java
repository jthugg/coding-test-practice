import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] baskets = new Integer[scanner.nextInt() + 1];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i;
        }
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            List<Integer> copiedBaskets = Arrays.asList(Arrays.copyOfRange(baskets, start, end + 1));
            Collections.reverse(copiedBaskets);
            for (int value : copiedBaskets) {
                baskets[start] = value;
                start++;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < baskets.length; i++) {
            answer.append(baskets[i]).append(" ");
        }
        System.out.println(answer);
    }
}