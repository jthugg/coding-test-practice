import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("x+", " ").trim().split(" "))
                .sorted()
                .toArray(String[]::new);
    }
}