import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        PriorityQueue<Integer> scores = new PriorityQueue<>(Collections.reverseOrder());
        while (scanner.hasNext()) {
            scores.add(scanner.nextInt());
        }
        int max = scores.peek();
        double sum = 0;
        while (!scores.isEmpty()) {
            sum += scores.poll();
        }
        System.out.println(100 * sum / max / count);
    }
}