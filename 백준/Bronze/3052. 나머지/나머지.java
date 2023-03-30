import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();
        
        while (scanner.hasNextInt()) {
            remainders.add(scanner.nextInt() % 42);
        }
        
        System.out.println(remainders.size());
    }
}