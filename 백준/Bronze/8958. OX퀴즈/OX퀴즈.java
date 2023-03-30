import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        while (scanner.hasNext()) {
            String[] scorecard = scanner.nextLine().split("X+");
            
            int sum = 0;
            
            for (String s : scorecard) {
                for (int i = 1; i <= s.length(); i++) {
                    sum += i;
                }
            }
            
            System.out.println(sum);
        }
    }
}