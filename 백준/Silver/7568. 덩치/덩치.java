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
        int count = Integer.parseInt(input);
        int[][] people = new int[count][2];
        
        for (int[] now : people) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            now[0] = Integer.parseInt(token.nextToken());
            now[1] = Integer.parseInt(token.nextToken());
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int[] man : people) {
            int rank = 0;
            for (int[] other : people) {
                if (other[0] > man[0] && other[1] > man[1]) {
                    rank++;
                }
            }
            answer.append(rank + 1).append(" ");
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(answer.toString().trim());
        writer.flush();
    }
}