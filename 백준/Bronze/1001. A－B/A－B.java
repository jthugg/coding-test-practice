import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] variables = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(variables[0]) - Integer.parseInt(variables[1]));
        scanner.close();
    }
}