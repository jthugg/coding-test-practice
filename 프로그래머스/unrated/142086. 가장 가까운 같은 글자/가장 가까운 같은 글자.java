import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastLocation = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char now = s.charAt(i);
            if (lastLocation.get(now) == null) {
                answer[i] = -1;
                lastLocation.put(now, i);
                continue;
            }
            answer[i] = i - lastLocation.get(now);
            lastLocation.put(now, i);
        }
        return answer;
    }
}