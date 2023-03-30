import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int sum = 0;
        
        for (String number : scanner.nextLine().split("")) {
            sum += Integer.parseInt(number);
        }
        
        System.out.println(sum);
    }
}