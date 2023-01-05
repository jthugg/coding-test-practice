import java.util.stream.Collectors;

class Solution {
    public String solution(String s, int n) {
        return s.chars().mapToObj(i -> {
            if (i >= 'a' && i <= 'z' && i + n > 'z') {
                return String.valueOf((char) (96 + i + n - 122));
            }
            if (i >= 'A' && i <= 'Z' && i + n > 'Z') {
                return String.valueOf((char) (64 + i + n - 90));
            }
            if (i == ' ') {
                return String.valueOf((char) (i));
            }
            return String.valueOf((char) (i + n));
        }).collect(Collectors.joining());
    }
}