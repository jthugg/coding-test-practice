import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).map(e -> {
            if (e == n) {
                return 1;
            }
            return 0;
        }).distinct().sum();
    }
}