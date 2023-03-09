class Solution {
    public int solution(int[] citations) {
        
        int answer = 0;
        
        for (int i = 0; i <= citations.length; i++) {
            int count = 0;
            for (int citation : citations) {
                if (citation >= i) {
                    count++;
                }
            }
            if (count >= i) {
                answer = i;
            }
        }
        
        return answer;
    }
}