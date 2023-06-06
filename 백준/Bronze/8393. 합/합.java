import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        long answer = 0L;
        for (int i = 1; i <= count; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}