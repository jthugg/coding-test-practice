class Solution {
    public int solution(int n, int m, int[] sections) {
        int answer = 0;
        int lastPainted = 0;
        for (int i = 0; i < sections.length; i++) {
            if (lastPainted <= sections[i]) {
                answer++;
                lastPainted = sections[i] + m;
            }
        }
        return answer;
    }
}