class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int result = 1; result * answer <= n; answer++) {
            result *= answer;
        }
        return answer - 1;
    }
}