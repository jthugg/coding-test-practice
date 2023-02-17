import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] count = new int[n];
        Map<String, Boolean> history = new HashMap<>();
        String lastWord = words[0].charAt(0) + "";
        for (int i = 0; i < words.length; i++) {
            count[i % n]++;
            if (history.get(words[i]) != null || 
                    !lastWord.endsWith(words[i].substring(0, 1))) {
                return new int[]{i % n + 1, count[i % n]};
            }
            history.put(words[i], true);
            lastWord = words[i];
        }
        return new int[] {0, 0};
    }
}