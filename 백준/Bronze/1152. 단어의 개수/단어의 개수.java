import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        
        while (scanner.hasNext()) {
            answer++;
            scanner.next();
        }
        
        System.out.println(answer);
    }
}