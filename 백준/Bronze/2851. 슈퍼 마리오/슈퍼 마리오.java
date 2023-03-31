import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        
        int[] answers = new int[3];
        
        while(input != null && answers[2] <= 100) {
            answers[0] = answers[1];
            answers[1] = answers[2];
            answers[2] = answers[2] + Integer.parseInt(input);
            input = reader.readLine();
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int i : answers) {
            if (Math.abs(100 - i) <= Math.abs(100 - answer)) {
                answer = i;
            }
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(answer));
        writer.flush();
    }
}