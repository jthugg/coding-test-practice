import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        n = scanner.nextInt();
        int now = 0;
        StringBuilder builder = new StringBuilder();
        
        while (scanner.hasNextInt()) {
            now = scanner.nextInt();
            if (now < n) {
                builder.append(now).append(" ");
            }
        }
        
        scanner.close();
        
        System.out.println(builder.toString().trim());
    }
}