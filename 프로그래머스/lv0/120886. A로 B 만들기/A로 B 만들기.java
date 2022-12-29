import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public int solution(String before, String after) {
        if (Stream.of(before.split(""))
                .sorted().collect(Collectors.joining())
                .equals(Stream.of(after.split(""))
                            .sorted().collect(Collectors.joining()))) {
            return 1;
        }
        return 0;
    }
}