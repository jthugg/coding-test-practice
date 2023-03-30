import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int n = new Scanner(System.in).nextInt();
        long answer = 1;
        
        while (n > 1) {
            answer *= n;
            n--;
        }
        
        System.out.println(answer);
    }
}