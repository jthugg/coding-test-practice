class Solution {
    public int solution(int n) {
        int[] fibo = {1, 1};
        int memo;
        
        for (int i = 2; i <= n; i++) {
            memo = fibo[0];
            fibo[0] = fibo[1];
            fibo[1] = (memo + fibo[0]) % 1000000007;
        }
        
        return fibo[1];
    }
}