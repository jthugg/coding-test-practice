import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(getAnswer(
                Integer.parseInt(input[0]),
                Integer.parseInt(input[1]), 
                Integer.parseInt(input[2]),
                Integer.parseInt(input[3])
        )));
        writer.flush();
    }
    
    private static int getAnswer(int x, int y, int p1, int p2) {
        
        for (int i = 0; i < 20_000; i++) {
            if (p1 == p2) {
                return p1;
            }
            if (p1 < p2) {
                p1 += x;
                continue;
            }
            p2 += y;
        }
        
        return -1;
    }
}