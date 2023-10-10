import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> counts = getCounts(keymap);
        int[] answer = new int[targets.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getMinimumCount(counts, targets[i]);
        }
        return answer;
    }
    
    private Map<String, Integer> getCounts(String[] keymap) {
        Map<String, Integer> counts = new HashMap<>();
        for (char spell = 'A'; spell <= 'Z'; spell++) {
            String now = String.valueOf(spell);
            counts.put(now, getCount(now, keymap));
        }
        return counts;
    }
    
    private int getCount(String spell, String[] keymap) {
        int count = 999;
        for (String map : keymap) {
            int index = map.indexOf(spell);
            if (index != -1) {
                count = Math.min(count, index + 1);
            }
        }
        if (count == 999) {
            count = -1;
        }
        return count;
    }
    
    private int getMinimumCount(Map<String, Integer> counts, String target) {
        int value = 0;
        for (String spell : target.split("")) {
            int count = counts.get(spell);
            if (count == -1) {
                return -1;
            }
            value += count;
        }
        return value;
    }
}