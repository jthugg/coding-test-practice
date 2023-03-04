import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> combs = new HashSet<>();
        int length = elements.length;
        
        for (int i = 0; i < length; i++) {
            int comb = 0;
            for (int j = 0; j < length; j++) {
                comb += elements[(i + j) % length];
                combs.add(comb);
            }
        }
        
        return combs.size();
    }
}