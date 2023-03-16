class Solution {
    public int solution(String s) {
        
        int answer = 0;
        
        while (!s.isEmpty()) {
            int same = 0;
            int not = 0;
            char first = s.charAt(0);
            for (char c : s.toCharArray()) {
                if (c == first) {
                    same++;
                }
                if (c != first) {
                    not++;
                }
                if (same + not > 1 && same == not) {
                    s = s.substring(same + not);
                    answer++;
                    break;
                }
            }
            if (same != not && s.length() == same + not) {
                answer++;
                break;
            }
        }
        
        return answer;
    }
}