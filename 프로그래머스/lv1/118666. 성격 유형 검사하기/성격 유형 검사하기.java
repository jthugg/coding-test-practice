import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] types = new String[] {"RT", "CF", "JM", "AN"};
        Map<String, Integer> scores = new HashMap<>();
        for (String type : types) {
            scores.put(type, 0);
        }
        for (int i = 0; i < choices.length; i++) {
            choices[i] -= 4;
            if (survey[i].equals("TR")
                    || survey[i].equals("FC")
                    || survey[i].equals("MJ")
                    || survey[i].equals("NA")) {
                choices[i] *= -1;
                survey[i] = new StringBuilder(survey[i]).reverse().toString();
            }
            scores.put(survey[i], scores.get(survey[i]) + choices[i]);
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (scores.get(types[i]) <= 0) {
                answer.append(types[i].charAt(0));
                continue;
            }
            answer.append(types[i].charAt(1));
        }
        return answer.toString();
    }
}