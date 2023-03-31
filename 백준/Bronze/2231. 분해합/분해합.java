import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = reader.readLine();
        int number = Integer.parseInt(input);
        
        for (int i = number - input.length() * 9; i < number; i++) {
            int now = i;
            int sum = 0;
            
            while (now > 0) {
                sum += now % 10;
                now /= 10;
            }
            
            if (i + sum == number) {
                writer.write(String.valueOf(i));
                writer.flush();
                return;
            }
        }
        
        writer.write("0");
        writer.flush();
        
    }
}