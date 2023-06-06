import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt() / 4;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            answer.append("long ");
        }
        System.out.println(answer.append("int"));
    }
}