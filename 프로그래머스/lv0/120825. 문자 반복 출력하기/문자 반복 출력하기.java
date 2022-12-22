import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder builder = new StringBuilder();
        Arrays.stream(my_string.split("")).forEach(spell -> builder.append(spell.repeat(n)));
        return builder.toString();
    }
}