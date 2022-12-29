import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars().mapToObj(i -> {
            if (i < 97) {
                return String.valueOf((char) (i + 32));
            }
            return String.valueOf((char) (i - 32));
        }).collect(Collectors.joining());
    }
}