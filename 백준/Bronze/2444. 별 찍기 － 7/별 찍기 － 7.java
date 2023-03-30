import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt() * 2 - 1;
        StringBuilder stars = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();
        
        for (int i = 1; i < n - 1; i += 2) {
            stars
                    .append(" ".repeat((n - i) / 2))
                    .append("*".repeat(i))
                    .append("\n");
            stack.push(stars);
            answer.append(stars);
            stars = new StringBuilder();
        }
        
        answer.append("*".repeat(n)).append("\n");
        
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        
        System.out.println(answer);
    }
}