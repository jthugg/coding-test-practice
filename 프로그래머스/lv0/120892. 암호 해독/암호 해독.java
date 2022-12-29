import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String cipher, int code) {
        return IntStream.rangeClosed(1, cipher.length()).mapToObj(i -> {
            if (i % code == 0) {
                return String.valueOf(cipher.charAt(i - 1));
            }
            return "";
        }).collect(Collectors.joining());
    }
}