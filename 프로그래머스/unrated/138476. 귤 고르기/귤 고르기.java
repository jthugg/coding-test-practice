import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        Map<Integer, Integer> box = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            int thisSize = tangerine[i];
            if (box.get(thisSize) == null) {
                box.put(thisSize, 1);
                continue;
            }
            box.put(thisSize, box.get(thisSize) + 1);
            if (box.get(thisSize) == k) {
                return 1;
            }
        }
        
        List<Integer> counts = new ArrayList<>(box.values());
        Collections.sort(counts, Collections.reverseOrder());
        
        int answer = 0;
        
        for (int each : counts) {
            answer++;
            k -= each;
            if (k <= 0) {
                return answer;
            }
        }
        
        return answer;
    }
}