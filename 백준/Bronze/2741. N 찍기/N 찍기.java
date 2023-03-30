import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            builder.append(i).append("\n");
        }
        
        System.out.println(builder.toString());
    }
}