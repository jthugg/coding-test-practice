import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int index : array) {
            if (count.get(index) == null) {
                count.put(index, 0);
            }
            count.put(index, count.get(index) + 1);
        }
        int maxValue = Collections.max(count.values());
        int valueCount = 0;
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == maxValue) {
                valueCount++;
                answer = entry.getKey();
            }
            if (valueCount > 1) {
                return -1;
            }
        }
        return answer;
    }
}