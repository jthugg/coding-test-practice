import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right).map(i -> {
            if (Math.sqrt(i) % 1.0 == 0.0) {
                return -i;
            }
            return i;
        }).sum();
    }
}