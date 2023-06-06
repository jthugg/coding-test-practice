import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[] {scanner.nextInt(), scanner.nextInt()};
        while (numbers[0] != 0) {
            System.out.println(numbers[0] + numbers[1]);
            numbers[0] = scanner.nextInt();
            numbers[1] = scanner.nextInt();
        }
    }
}