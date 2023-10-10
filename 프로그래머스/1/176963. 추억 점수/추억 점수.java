import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> missing = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            missing.put(name[i], yearning[i]);
        }
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                answer[i] += missing.getOrDefault(person, 0);
            }
        }
        return answer;
    }
}