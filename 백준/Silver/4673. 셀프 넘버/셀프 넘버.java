import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        
        int[] map = new int[20_000];
        
        for (int me = 1; me <= 10_000; me++) {
            map[getDn(me)]++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < 10_000; i++) {
            if (map[i] == 0) {
                answer.append(i).append("\n");
            }
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(answer.toString());
        writer.flush();
    }
    
    private static int getDn(int me) {
        
        for (int now = me; now > 0; now /= 10) {
            me += now % 10;
        }
        
        return me;
    }
}