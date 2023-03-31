import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        
        int count = Integer.parseInt(token.nextToken());
        int number = Integer.parseInt(token.nextToken());
        int[] cards = new int[count];
        
        token = new StringTokenizer(reader.readLine());
        
        for (int i = 0; i < count; i++) {
            cards[i] = Integer.parseInt(token.nextToken());
        }
        
        int answer = 0;
        
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= number) {
                        if (answer < sum) {
                            answer = sum;
                        }
                    }
                }
            }
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(answer));
        writer.flush();
    }
}