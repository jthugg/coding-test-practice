import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        
        List<String> table = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 26; j++) {
                String alphabet = String.valueOf((char) (j + 97));
                if (skip.contains(alphabet)) {
                    continue;
                }
                table.add(alphabet);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String now = String.valueOf(s.charAt(i));
            answer.append(table.get((table.indexOf(now) + index) % table.size()));
        }
        return answer.toString();
    }
}