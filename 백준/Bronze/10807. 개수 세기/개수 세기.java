import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0, number = 0; i < count; i++) {
            number = scanner.nextInt();
            data.put(number, data.getOrDefault(number, 0) + 1);
        }
        System.out.println(data.getOrDefault(scanner.nextInt(), 0));
    }
}