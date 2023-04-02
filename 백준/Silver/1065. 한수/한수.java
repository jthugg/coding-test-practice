import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        var target = Integer.parseInt(reader.readLine());
        
        if (target < 100) {
            var writer = new BufferedWriter(new OutputStreamWriter(System.out));

            writer.write(String.valueOf(target));
            writer.flush();
            
            return;
        }
        
        var answer = 0;
        
        for (int i = 100; i <= target; i++) {
            answer += checkNumber(i);
        }
        
        var writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(answer + 99));
        writer.flush();
    }
    
    private static int checkNumber(int i) {
        
        Queue<Integer> digits = new LinkedList<>();
        
        while (i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        
        var tolerance = digits.poll() - digits.peek();
        
        while (digits.size() > 1) {
            if (digits.poll() - digits.peek() != tolerance) {
                return 0;
            }
        }
        
        return 1;
    }
}
