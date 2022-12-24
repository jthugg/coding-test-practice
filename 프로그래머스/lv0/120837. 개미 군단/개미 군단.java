import java.util.stream.Stream;

class Solution {
    public int solution(int hp) {
        return Stream.of(hp / 5, hp % 5 / 3, hp % 5 % 3).mapToInt(Integer::intValue).sum();
    }
}