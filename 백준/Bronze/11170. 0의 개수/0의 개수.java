import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringBuilder answer = new StringBuilder();
        
        for (int count = Integer.parseInt(input); count > 0; count--) {
            
            input = reader.readLine();
            StringTokenizer token = new StringTokenizer(input);
            int start = Integer.parseInt(token.nextToken());
            int end = Integer.parseInt(token.nextToken());
            int zero = 0;
            
            while (start <= end) {
            
                if (start == 0) {
                    zero++;
                }
            
                for (int now = start; now > 0; now /= 10) {
                    if (now % 10 == 0) {
                        zero++;
                    }
                }
            
                start++;
            }
            
            answer.append(zero).append("\n");
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(answer.toString());
        writer.flush();
    }
}