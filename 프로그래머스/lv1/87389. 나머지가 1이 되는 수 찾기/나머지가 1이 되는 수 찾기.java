class Solution {
    public int solution(int n) {
        int answer = 1;
        for (; n % answer != 1; answer++) {}
        return answer;
    }
}