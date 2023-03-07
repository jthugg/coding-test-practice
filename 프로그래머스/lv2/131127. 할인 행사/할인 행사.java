import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        Map<String, Integer> wishlist = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            if (wishlist.get(want[i]) == null) {
                wishlist.put(want[i], number[i]);
                continue;
            }
            wishlist.put(want[i], wishlist.get(want[i]) + number[i]);
        }
        
        Queue<String> discounts = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            discounts.add(discount[i]);
        }
        
        List<Map.Entry<String, Integer>> entry = new ArrayList<>(wishlist.entrySet());
        
        int answer = 0;
        
        for (int i = 10; i <= discount.length; i++) {
            int count = 0;
            for (Map.Entry<String, Integer> each : entry) {
                if (Collections.frequency(discounts, each.getKey()) == each.getValue()) {
                    count++;
                }
            }
            if (count == wishlist.size()) {
                answer++;
            }
            discounts.poll();
            if (i < discount.length) {
                discounts.add(discount[i]);
            }
        }
        
        return answer;
    }
}