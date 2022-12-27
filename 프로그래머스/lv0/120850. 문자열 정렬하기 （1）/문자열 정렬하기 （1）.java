import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {
        return Stream.of(my_string.replaceAll("[a-z]", "").split("")).sorted().mapToInt(i -> Integer.parseInt(i)).toArray();
    }
}