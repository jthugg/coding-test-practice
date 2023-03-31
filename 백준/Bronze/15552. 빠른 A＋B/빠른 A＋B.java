import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());
        StringTokenizer token;
        StringBuilder answer = new StringBuilder();
        
        while (count > 0) {
            token = new StringTokenizer(reader.readLine());
            answer.append(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken())).append("\n");
            count--;
        }
        
        writer.write(answer.toString());
        writer.flush();
    }
}