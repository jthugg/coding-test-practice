import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] numbers = new BufferedReader(new InputStreamReader(System.in))
                .readLine().split(" ");
        System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
    }
}