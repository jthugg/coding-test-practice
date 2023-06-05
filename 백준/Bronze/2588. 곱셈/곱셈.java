import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b;

        while (c > 0) {
            System.out.println(a * (c % 10));
            c /= 10;
        }

        System.out.println(a * b);
    }
}