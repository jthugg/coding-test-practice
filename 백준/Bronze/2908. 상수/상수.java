import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] numbers = new StringBuilder(new Scanner(System.in).nextLine()).reverse().toString().split(" ");

        System.out.println(Math.max(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1])));
    }
}