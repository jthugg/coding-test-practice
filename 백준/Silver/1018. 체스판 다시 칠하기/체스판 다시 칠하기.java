import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]) throws IOException {
        
        Solution solution = new Solution();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(solution.getAnswer()));
        writer.flush();
    }
}

class Solution {
    
    private static char[][] wBoard = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };
    
    private char[][] myBoard;
    
    public Solution() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        StringTokenizer token = new StringTokenizer(input);
        
        this.myBoard = new char[Integer.parseInt(token.nextToken())][Integer.parseInt(token.nextToken())];
        
        input = reader.readLine();
        
        for (int i = 0; i < this.myBoard.length; i++) {
            myBoard[i] = input.toCharArray();
            input = reader.readLine();
        }
    }
    
    public int getAnswer() {
        
        PriorityQueue<Integer> counts = new PriorityQueue<>();
        
        for (int i = 0; i + 8 <= myBoard.length; i++) {
            for (int j = 0; j + 8 <= myBoard[i].length; j++) {
                counts.add(find(i, j));
            }
        }
        
        return counts.poll();
    }
    
    private int find(int i, int j) {
        int countW = 0;
        int countB = 0;
        
        for (char[] wRow : wBoard) {
            for (char wCol : wRow) {
                if (wCol != this.myBoard[i][j]) {
                    countW++;
                    j++;
                    continue;
                }
                countB++;
                j++;
            }
            i++;
            j -= 8;
        }
        
        return Math.min(countW, countB);
    }
}