import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(num_list.length - 5)
                .mapToInt(i -> i)
                .sorted()
                .toArray();
    }
}