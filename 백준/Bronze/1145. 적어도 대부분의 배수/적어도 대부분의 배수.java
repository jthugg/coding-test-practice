import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int[] numbers = new int[input.length];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(getAnswer(numbers)));
        writer.flush();
    }
    
    private static int getAnswer(int[] numbers) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    heap.add(getLcm(numbers[i], numbers[j], numbers[k]));
                }
            }
        }
        
        return heap.poll();
    }
    
    private static int getLcm(int num1, int num2, int num3) {
        
        int[] muls = {
                num1 * num2,
                num2 * num3,
                num3 * num1
        };
        
        int gcd = new BigInteger(String.valueOf(muls[0])).gcd(new BigInteger(String.valueOf(muls[1])).gcd(new BigInteger(String.valueOf(muls[2])))).intValue();
        
        return muls[0] * num3 / gcd;
    }
}