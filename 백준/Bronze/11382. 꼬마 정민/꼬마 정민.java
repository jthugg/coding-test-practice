import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long answer = 0L;
        while (scanner.hasNext()) {
            answer += scanner.nextLong();
        }
        System.out.println(answer);
    }
}