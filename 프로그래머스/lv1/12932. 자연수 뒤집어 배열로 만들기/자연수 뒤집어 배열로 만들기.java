class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        for (int i = 0; n > 0; i++, n /= 10) {
            answer[i] = (int) (n % 10);
        }
        return answer;
    }
}