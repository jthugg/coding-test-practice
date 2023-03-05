import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        
        List<String> set1 = new ArrayList<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            String now = str1.substring(i, i + 2).toLowerCase();
            if (Pattern.matches("[a-z]{2}", now)) {
                set1.add(now);
            }
        }
        
        List<String> set2 = new ArrayList<>();
        
        for (int i = 0; i < str2.length() - 1; i++) {
            String now = str2.substring(i, i + 2).toLowerCase();
            if (Pattern.matches("[a-z]{2}", now)) {
                set2.add(now);
            }
        }
        
        int intersection = 0;
        int union = set1.size() + set2.size();
        
        for (String index : set1) {
            if (set2.contains(index)) {
                intersection++;
                set2.remove(index);
            }
        }
        
        union -= intersection;
        
        if (union == 0) {
            return 65536;
        }
        
        return 65536 * intersection / union;
    }
}