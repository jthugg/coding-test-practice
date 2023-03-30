import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fixedCost = scanner.nextLong();
        long variableCost = scanner.nextLong();
        long price = scanner.nextLong();
        scanner.close();
        
        if (variableCost >= price) {
            System.out.println(-1);
            return;
        }
        
        long count = 1;
        
        while (fixedCost >= count * (price - variableCost)) {
            count++;
        }
        
        System.out.println(count);
    }
}