import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {

        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 1; i <= k; i++) {
            heap.add(Integer.parseInt(new StringBuilder().append(i * n).reverse().toString()));
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(heap.poll()));
        writer.flush();
    }
}