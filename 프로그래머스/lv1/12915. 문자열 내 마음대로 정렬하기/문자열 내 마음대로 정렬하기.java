import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).map(i -> i.charAt(n) + i).sorted().map(i -> i.substring(1, i.length())).toArray(String[]::new);
    }
}