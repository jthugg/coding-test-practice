import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.toLowerCase().chars().sorted()
            .mapToObj(i -> String.valueOf((char) i))
            .collect(Collectors.joining());
    }
}