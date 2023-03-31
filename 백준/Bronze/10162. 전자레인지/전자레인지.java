import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int time = Integer.parseInt(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine()).nextToken());
        
        if (time % 300 % 60 % 10 == 0) {
            writer.write(new StringBuilder().append(time / 300).append(" ").append(time % 300 / 60).append(" ").append(time % 60 / 10).toString());
            writer.flush();
            return;
        }
        
        writer.write("-1");
        writer.flush();
    }
}