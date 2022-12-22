class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        for (int index = 0, odds = 1; odds <= n; index++, odds += 2) {
            answer[index] = odds;
        }
        return answer;
    }
}