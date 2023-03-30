import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        long n = new Scanner(System.in).nextLong();
        long answer = 0;
        
        while (n > 0) {
            answer += n;
            n--;
        }
        
        System.out.println(answer);
    }
}