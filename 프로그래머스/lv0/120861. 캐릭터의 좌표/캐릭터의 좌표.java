class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (String direction : keyinput) {
            if (direction.equals("up") && answer[1] < board[1] / 2) {
                answer[1] += 1;
            }
            if (direction.equals("down") && answer[1] > board[1] / 2 * -1) {
                answer[1] -= 1;
            }
            if (direction.equals("right") && answer[0] < board[0] / 2) {
                answer[0] += 1;
            }
            if (direction.equals("left") && answer[0] > board[0] / 2 * -1) {
                answer[0] -= 1;
            }
        }
        return answer;
    }
}