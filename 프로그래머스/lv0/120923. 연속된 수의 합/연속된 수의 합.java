class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (num % 2 == 0) {
            for (int i = total / num - num / 2 + 1, j = 0; j < num; i++, j++) {
                answer[j] = i;
            }
            return answer;
        }
        for (int i = total / num - num / 2, j = 0; j < num; i++, j++) {
            answer[j] = i;
        }
        return answer;
    }
}