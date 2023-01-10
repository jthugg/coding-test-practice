class Solution {
    public int[] solution(int[] answers) {
        int[] sheet1 = {1, 2, 3, 4, 5};
        int[] sheet2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] sheet3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == sheet1[i % sheet1.length]) {
                score1++;
            }
            if (answers[i] == sheet2[i % sheet2.length]) {
                score2++;
            }
            if (answers[i] == sheet3[i % sheet3.length]) {
                score3++;
            }
        }
        int[] scores = {score1, score2, score3};
        int max = 0;
        for (int score : scores) {
            if (score >= max) {
                max = score;
            }
        }
        int count = 0;
        for (int score : scores) {
            if (score == max) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < 3; i++) {
            if (scores[i] == max) {
                result[j] = i + 1;
                j++;
            }
        }
        return result;
    }
}