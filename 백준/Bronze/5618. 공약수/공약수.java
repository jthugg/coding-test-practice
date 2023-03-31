import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");
        int[] numbers = new int[input.length];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i <= min; i++) {
            int valid = 0;
            for (int number : numbers) {
                if (number % i == 0) {
                    valid++;
                }
            }
            if (valid == numbers.length) {
                answer.append(i).append("\n");
            }
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(answer.toString());
        writer.flush();
    }
}