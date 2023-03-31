import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        
        input = reader.readLine();
        
        int[] sums = new int[1000];
        
        for (int i = 1; i < sums.length; i++) {
            sums[i] = i + sums[i - 1];
        }
        
        StringBuilder answer = new StringBuilder();
        
        while (input != null) {
            answer.append(getAnswer(sums, Integer.parseInt(input))).append("\n");
            input = reader.readLine();
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(answer.toString());
        writer.flush();
    }
    
    public static String getAnswer(int[] sums, int number) {
        
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                for (int k = 1; k < number; k++) {
                    int eureka = sums[i] + sums[j] + sums[k];
                    if (eureka == number) {
                        return "1";
                    }
                }
            }
        }
        
        return "0";
    }
}