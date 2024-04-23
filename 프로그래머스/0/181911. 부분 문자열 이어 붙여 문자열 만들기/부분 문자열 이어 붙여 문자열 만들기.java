import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {

    public String solution(String[] my_strings, int[][] parts) {
        return IntStream.range(0, my_strings.length)
            .mapToObj(value -> my_strings[value].substring(parts[value][0], parts[value][1] + 1))
            .collect(Collectors.joining());
    }

}
