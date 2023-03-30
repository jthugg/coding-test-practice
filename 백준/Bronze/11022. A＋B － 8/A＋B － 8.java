import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            int[] parameters = new int[2];
            parameters[0] = scanner.nextInt();
            parameters[1] = scanner.nextInt();
            builder
                    .append("Case #")
                    .append(i)
                    .append(": ")
                    .append(parameters[0])
                    .append(" + ")
                    .append(parameters[1])
                    .append(" = ")
                    .append(parameters[0] + parameters[1])
                    .append("\n");
        }
        
        scanner.close();
        
        System.out.println(builder.toString());

    }
}