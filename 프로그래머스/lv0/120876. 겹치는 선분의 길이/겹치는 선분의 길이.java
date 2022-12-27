import java.util.stream.IntStream;

class Solution {
    public int solution(int[][] lines) {
        return (int) IntStream.rangeClosed(Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]), Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1])).map(i -> {
            int j = i;
            for (int[] line : lines) {
                if (i >= line[0] && i < line[1]) {
                    j++;
                }
            }
            return j - i;
        }).filter(i -> i > 1).count();
    }
}