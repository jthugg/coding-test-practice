import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.ArrayList;

class Solution {
    public int solution(String[][] clothes) {

        Map<String, Integer> each = new HashMap<>();
        for (String[] parts : clothes) {
            String part = parts[1];
            if (each.get(part) == null) {
                each.put(part, 1);
                continue;
            }
            each.put(part, each.get(part) + 1);
        }
        
        int answer = 1;
        Collection<Integer> counts = each.values();
        
        for (int count : counts) {
            answer *= count + 1;
        }
            
        return --answer;
    }
}