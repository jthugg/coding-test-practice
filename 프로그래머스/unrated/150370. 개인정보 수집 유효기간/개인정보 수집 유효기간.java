import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        LocalDate now = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        
        Map<String, Integer> monthOfTerm = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            monthOfTerm.put(split[0], Integer.parseInt(split[1]));
        }
        
        List<Integer> mustExpires = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            if (!LocalDate.parse(split[0],DateTimeFormatter.ofPattern("yyyy.MM.dd"))
                .plusMonths(monthOfTerm.get(split[1])).isAfter(now)) {
                mustExpires.add(i);
            }
        }
        
        int[] answer = new int[mustExpires.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mustExpires.get(i) + 1;
        }
        return answer;
    }
}