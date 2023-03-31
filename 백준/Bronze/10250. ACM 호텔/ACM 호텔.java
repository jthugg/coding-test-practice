import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        
        while (count > 0) {
            
            int floors = scanner.nextInt();
            scanner.nextInt();
            int customer = scanner.nextInt();
            int floor = floors * 100;
            int room = customer / floors;
            
            if (customer % floors != 0) {
                floor = customer % floors * 100;
                room++;
            }
            
            System.out.println(floor + room);
            
            count--;
        }
    }
}