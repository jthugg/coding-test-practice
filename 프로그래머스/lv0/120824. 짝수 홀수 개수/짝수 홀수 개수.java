import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] num_list) {
        int evenNumberCount = (int) Arrays.stream(num_list).filter(index -> index % 2 == 0).count();
        return new int[] {evenNumberCount, num_list.length - evenNumberCount};
    }
}