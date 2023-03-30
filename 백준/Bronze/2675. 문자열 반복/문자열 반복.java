import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        
        scanner.next();
        
        while (scanner.hasNext()) {
            int repeat = scanner.nextInt();
            for (String each : scanner.next().split("")) {
                builder.append(each.repeat(repeat));
            }
            builder.append("\n");
        }
        
        System.out.println(builder.toString());
    }
}