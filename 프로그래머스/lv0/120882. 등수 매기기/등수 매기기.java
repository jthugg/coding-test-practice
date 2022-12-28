import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        return Arrays.stream(score).mapToInt(i -> (int) Arrays.stream(score).mapToInt(j -> j[0] + j[1]).filter(j -> j > i[0] + i[1]).count() + 1).toArray();
    }
}