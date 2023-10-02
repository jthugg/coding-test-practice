import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int each : arr) {
            for(int i = 0; i < each; i++) {
                answer.add(each);
            }
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}