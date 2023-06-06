import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            answer -= scanner.nextInt() * scanner.nextInt();
        }
        if (answer == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}