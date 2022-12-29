import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
        return IntStream.rangeClosed(i, j).map(index -> String.valueOf(index).length() - String.valueOf(index).replaceAll(String.valueOf(k), "").length()).sum();
    }
}