import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        
        String[] numbers = s.replaceAll("[^0-9]+", " ").trim().split(" ");
        
        Map<Integer, Integer> each = new HashMap<>();
        
        int max = 1;
        
        for (String index : numbers) {
            int number = Integer.parseInt(index);
            if (each.get(number) == null) {
                each.put(number, 1);
                continue;
            }
            int count = each.get(number);
            each.put(number, count + 1);
            count++;
            if (max < count) {
                max = count;
            }
        }
        
        int[] answer = new int[max];
        
        for (int key : each.keySet()) {
            int location = max - each.get(key);
            answer[location] = key;
        }
        
        return answer;
    }
}