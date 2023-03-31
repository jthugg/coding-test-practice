import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token;
        String input = reader.readLine();
        
        while (!input.equals("0 0")) {
            token = new StringTokenizer(input);

            int target = Integer.parseInt(token.nextToken());
            int count = Integer.parseInt(token.nextToken());
            int result = (int) Math.round(Math.pow(target, 1.0 / count));

            result = validate(target, count, result);

            writer.write(result + "\n");
            writer.flush();

            input = reader.readLine();
        }
    }
    
    private static int validate(int target, int count, int result) {

        if (Math.abs(target - (int) Math.pow(result, count)) < Math.abs(target - (int) Math.pow(result - 1, count))) {
            return result;
        }

        return result - 1;
    }
}