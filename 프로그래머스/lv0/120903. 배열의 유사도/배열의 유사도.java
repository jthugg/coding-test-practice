import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).mapToInt(i -> {
            for (String s : s2) {
                if (i.equals(s)) {
                    return 1;
                }
            }
            return 0;
        }).filter(i -> i == 1).count();
    }
}