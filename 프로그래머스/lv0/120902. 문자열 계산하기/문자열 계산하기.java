import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll(" \\+ ", " ").replaceAll(" \\- ", " \\-").split(" ")).mapToInt(i -> Integer.parseInt(i)).sum();
    }
}