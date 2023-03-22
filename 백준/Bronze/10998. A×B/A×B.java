import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] numbers = new Scanner(System.in).nextLine().split(" ");
        System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));
    }
}