import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        for (int i = score.length % m, count = 0; i < score.length; i++, count++) {
            if (count % m == 0) {
                count = 0;
                answer += score[i] * m;
            }
        }
        return answer;
    }
}