import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] strlist) {
        return Stream.of(strlist).mapToInt(index -> index.length()).toArray();
    }
}