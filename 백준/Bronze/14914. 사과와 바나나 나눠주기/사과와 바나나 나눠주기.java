import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        StringTokenizer token = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int apple = Integer.parseInt(token.nextToken());
        int banana = Integer.parseInt(token.nextToken());
        StringBuilder answer = new StringBuilder();
        
        for (int friends = 1; apple / friends != 0 && banana / friends != 0; friends++) {
            if (apple % friends != 0 || banana % friends != 0) {
                continue;
            }
            answer.append(friends).append(" ").append(apple / friends).append(" ").append(banana / friends).append(" \n");
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(answer.toString());
        writer.flush();
    }
}