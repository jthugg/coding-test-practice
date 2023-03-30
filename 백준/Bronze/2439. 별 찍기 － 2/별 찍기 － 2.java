import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= count; i++) {
            System.out.println(" ".repeat(count - i) + "*".repeat(i));
        }
    }
}