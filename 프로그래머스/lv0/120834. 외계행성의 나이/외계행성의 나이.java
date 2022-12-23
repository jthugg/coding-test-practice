import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars().mapToObj(number -> String.valueOf((char) (number + 49))).collect(Collectors.joining());
    }
}