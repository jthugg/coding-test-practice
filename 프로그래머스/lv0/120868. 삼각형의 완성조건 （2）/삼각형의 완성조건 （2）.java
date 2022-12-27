import java.util.stream.IntStream;

class Solution {
    public int solution(int[] sides) {
        return (int) IntStream.range(1, sides[0] + sides[1]).filter(i -> i < sides[0] + sides[1] && i + sides[0] > sides[1] && i + sides[1] > sides[0]).count();
    }
}