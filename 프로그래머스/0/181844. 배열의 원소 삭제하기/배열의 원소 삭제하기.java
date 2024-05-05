import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> delete = Arrays.stream(delete_list).boxed().collect(Collectors.toList());
        return Arrays.stream(arr)
            .filter(value -> !delete.contains(value))
            .boxed()
            .mapToInt(value -> value)
            .toArray();
    }
}