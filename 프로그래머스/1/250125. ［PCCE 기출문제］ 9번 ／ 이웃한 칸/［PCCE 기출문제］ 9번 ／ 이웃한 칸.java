class Solution {

    public int solution(String[][] board, int h, int w) {
        return checkUp(board, h, w)
            + checkDown(board, h, w)
            + checkLeft(board, h, w)
            + checkRight(board, h, w);
    }
    
    private int checkUp(String[][] board, int h, int w) {
        if (h > 0) {
            return getBit(board[h][w].equals(board[h - 1][w]));
        }
        return 0;
    }
    
    private int checkDown(String[][] board, int h, int w) {
        if (h < board.length - 1) {
            return getBit(board[h][w].equals(board[h + 1][w]));
        }
        return 0;
    }
    
    private int checkLeft(String[][] board, int h, int w) {
        if (w > 0) {
            return getBit(board[h][w].equals(board[h][w - 1]));
        }
        return 0;
    }
    
    private int checkRight(String[][] board, int h, int w) {
        if (w < board[0].length - 1) {
            return getBit(board[h][w].equals(board[h][w + 1]));
        }
        return 0;
    }
    
    private int getBit(boolean value) {
        if (value) {
            return 1;
        }
        return 0;
    }

}
