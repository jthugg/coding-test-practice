import java.util.stream.IntStream;

class Solution {
    public int solution(int num, int k) {
        return IntStream.rangeClosed(1, String.valueOf(num).length())
            .filter(i -> String.valueOf(num).split("")[i - 1].equals(String.valueOf(k)))
            .min().orElse(-1);
    }
}