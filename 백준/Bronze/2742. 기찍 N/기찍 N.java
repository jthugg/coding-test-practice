import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        StringBuilder builder = new StringBuilder();
        
        while (n > 0) {
            builder.append(n).append("\n");
            n--;
        }
        
        System.out.println(builder.toString());
    }
}