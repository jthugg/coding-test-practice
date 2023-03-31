import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int length = input.length();
        Stack<Stack<String>> trues = new Stack<>();
        Stack<Stack<String>> falses = new Stack<>();
        Stack<String> stack = new Stack<>();
        
        for (String each : input.split("")) {
        
            if (stack.isEmpty()) {
                stack.push(each);
                continue;
            }
        
            if (stack.peek().equals(each)) {
                continue;
            }
            
            if (stack.peek().equals("1")) {
                trues.push(stack);
                stack = new Stack<>();
                stack.push(each);
                continue;
            }
            
            if (stack.peek().equals("0")) {
                falses.push(stack);
                stack = new Stack<>();
                stack.push(each);
                continue;
            }
        }
        
        if (!stack.isEmpty()) {
            if (stack.peek().equals("1")) {
                trues.push(stack);
            }
            if (stack.peek().equals("0")) {
                falses.push(stack);
            }
        }
        
        System.out.println(Math.min(trues.size(), falses.size()));
    }
}