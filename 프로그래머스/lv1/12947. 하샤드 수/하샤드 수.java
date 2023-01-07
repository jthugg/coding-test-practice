import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        return x % Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(i -> Integer.parseInt(i)).sum() == 0;
    }
}