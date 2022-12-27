import java.util.stream.Stream;

class Solution {
    public int solution(String s) {
        return Stream.of(s.replaceAll("(-[0-9]+|[0-9]+) Z", " ").replaceAll("[\\s]+", " 0 ").trim().split(" ")).mapToInt(i -> Integer.parseInt(i)).sum();
    }
}