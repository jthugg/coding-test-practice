import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> succ = new HashMap<>();
        for (int i = 1; i < N + 1; i++) {
            int count1 = 0;
            int count2 = 0;
            for (int j : stages) {
                if (j >= i) {
                    count1++;
                }
                if (j > i) {
                    count2++;
                }
            }
            if (count1 == 0) {
                succ.put(i, 1.0);
                continue;
            }
            succ.put(i, (double) count2 / count1);
        }
        List<Map.Entry<Integer, Double>> entries = new ArrayList<>(succ.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        int count = 0;
        for (Map.Entry<Integer, Double> entry : entries) {
            answer[count] = entry.getKey();
            count++;
        }
        return answer;
    }
}