import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int max = Integer.MIN_VALUE;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; scanner.hasNextInt(); i++) {
            int now = scanner.nextInt();
            if (max < now) {
                max = now;
                answer = i;
            }
        }
        
        System.out.println(max);
        System.out.println(answer);
    }
}