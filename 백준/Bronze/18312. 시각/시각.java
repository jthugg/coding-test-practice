import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String format = "%02d";
        int answer = 0;
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (String.format(format, i).contains(input[1]) || String.format(format, j).contains(input[1]) || String.format(format, k).contains(input[1])) {
                        answer++;
                    }
                }
            }
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(answer));
        writer.flush();
    }
}