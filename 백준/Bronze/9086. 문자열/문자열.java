import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            char[] input = scanner.next().toCharArray();
            answer.append(input[0]).append(input[input.length - 1]).append("\n");
        }
        System.out.println(answer);
    }
}