import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> isComplete = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (isComplete.get(participant[i]) == null) {
                isComplete.put(participant[i], 1);
                continue;
            }
            isComplete.put(participant[i], isComplete.get(participant[i]) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            isComplete.put(completion[i], isComplete.get(completion[i]) - 1);
        }
        for (int i = 0; i < participant.length; i++) {
            if (isComplete.get(participant[i]) == 1) {
                return participant[i];
            }
        }
        return null;
    }
}