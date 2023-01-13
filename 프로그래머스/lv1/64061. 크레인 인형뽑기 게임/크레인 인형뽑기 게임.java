import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();
        for (int move : moves) {
            int col = move - 1;
            int puppet = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][col] != 0) {
                    puppet = board[i][col];
                    board[i][col] = 0;
                    break;
                }
            }
            if (puppet == 0) {
                continue;
            }
            if (bucket.isEmpty()) {
                bucket.add(puppet);
                continue;
            }
            if (bucket.peek() == puppet) {
                bucket.pop();
                answer++;
                continue;
            }
            bucket.add(puppet);
        }
        return answer * 2;
    }
}