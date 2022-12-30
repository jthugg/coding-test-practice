import java.util.stream.IntStream;

class Solution {
    public int solution(String A, String B) {
        return IntStream.range(0, A.length()).filter(i -> B.equals(A.substring(A.length() - i, A.length()) + A.substring(0, A.length() - i))).max().orElse(-1);
    }
}