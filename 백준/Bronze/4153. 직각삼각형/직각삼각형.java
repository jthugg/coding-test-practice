import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextInt()) {
            List<Integer> sides = new LinkedList<>();
            
            for (int i = 0; i < 3; i++) {
                sides.add(scanner.nextInt());
            }
            
            if (sides.get(0) == 0) {
                return;
            }
            
            Collections.sort(sides, Collections.reverseOrder());
        
            if (sides.get(0) * sides.get(0) == sides.get(1) * sides.get(1) + sides.get(2) * sides.get(2)) {
                System.out.println("right");
                continue;
            }
        
            System.out.println("wrong");
        }
    }
}