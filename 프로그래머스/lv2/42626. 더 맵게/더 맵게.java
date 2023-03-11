import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> scores = new PriorityQueue<>();
        
        for (int score : scoville) {
            scores.add(score);
        }
        
        int answer = 0;
        
        while (scores.size() > 1 && scores.peek() < K) {
            int score0 = scores.poll();
            int score1 = scores.poll();
            scores.add(Math.min(score0, score1) + (2 * Math.max(score0, score1)));
            answer++;
        }
        
        if (scores.peek() < K) {
            return -1;
        }
        
        return answer;
    }
}