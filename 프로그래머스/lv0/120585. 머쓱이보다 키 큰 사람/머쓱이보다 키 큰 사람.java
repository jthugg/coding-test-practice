class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int friendsHeight : array) {
            if (friendsHeight > height) {
                answer++;
            }
        }
        return answer;
    }
}