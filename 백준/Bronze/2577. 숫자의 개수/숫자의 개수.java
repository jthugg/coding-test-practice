import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        
        Map<String, Integer> counts = new TreeMap<>();
        
        for (int i = 0; i < 10; i++) {
            counts.put(String.valueOf(i), 0);
        }
        
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        
        while (scanner.hasNextInt()) {
            sum *= scanner.nextInt();
        }
        
        String[] digits = String.valueOf(sum).split("");
        
        for (String digit : digits) {
            counts.put(digit, counts.get(digit) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}