import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return IntStream.range(0, my_string.length()).mapToObj(i -> {
            if (my_string.substring(0, i).contains(String.valueOf(my_string.charAt(i)))) {
                return "";
            }
            return String.valueOf(my_string.charAt(i));
        }).collect(Collectors.joining());
    }
}