class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board.length;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 1) {
                    continue;
                }
                answer--;
                for (int k = i - 1; k < i + 2; k++) {
                    if (k == -1 || k == board.length) {
                        continue;
                    }
                    for (int l = j - 1; l < j + 2; l++) {
                        if (l == -1 || l == board.length) {
                            continue;
                        }
                        if (board[k][l] == 0) {
                            board[k][l] = 2;
                            answer--;
                        }
                    }
                }
            }
        }
        return answer;
    }
}