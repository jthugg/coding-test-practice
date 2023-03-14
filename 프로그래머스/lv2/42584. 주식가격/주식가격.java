import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        
        for (int i = 0; i < prices.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < prices.length - 1 && prices[i] <= prices[j]; j++) {
                if (prices[i] <= prices[j]) {
                    count++;
                }
            }
            prices[i] = count;
        }
        
        prices[prices.length - 1] = 0;
        
        return prices;
    }
}