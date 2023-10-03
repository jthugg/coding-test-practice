class Solution {
    public int solution(int n) {
        if (n % 2 == 1) {
            int answer = 0;
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
            return answer;
        }
        int answer = 0;
        for (int i = 0; i <= n; i += 2) {
            answer += i * i;
        }
        return answer;
    }
}