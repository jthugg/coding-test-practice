import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> {
            if (i != 0 && arr[i] == arr[i - 1]) {
                return -1;
            }
            return arr[i];
        }).filter(i -> i != -1).toArray();
    }
}