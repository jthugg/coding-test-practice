import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        Queue<Integer> xs = new LinkedList<>();
        Queue<Integer> ys = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextInt()) {
            xs.add(scanner.nextInt());
            ys.add(scanner.nextInt());
        }
        
        String answer = " ";
        
        while (xs.size() > 2) {
            int first = xs.poll();
            if (xs.contains(first)) {
                xs.add(first);
                continue;
            }
            answer = first + answer;
        }
        
        while (ys.size() > 2) {
            int first = ys.poll();
            if (ys.contains(first)) {
                ys.add(first);
                continue;
            }
            answer = answer + first;
        }
        
        System.out.println(answer);
    }
}