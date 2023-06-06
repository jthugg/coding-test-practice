import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            answer
                    .append("Case #")
                    .append(i)
                    .append(": ")
                    .append(scanner.nextInt() + scanner.nextInt())
                    .append("\n");
        }
        System.out.println(answer);
    }
}