import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int answer = 0;
        
        while (count > 0) {
            answer += validate(reader.readLine());
            count--;
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(answer));
        writer.flush();
    }
    
    private static int validate(String word) {
        
        for (char c = 'a'; c <= 'z'; c++) {
            int first = word.indexOf(c);
            int last = word.lastIndexOf(c);
            if (last - first > 1) {
                if (word.substring(first, last).equals(String.valueOf(c).repeat(last - first))) {
                    continue;
                }
                return 0;
            }
        }
        
        return 1;
    }
}