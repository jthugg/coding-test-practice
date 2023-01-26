import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> ranks = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            ranks.add(score[i]);
            Collections.sort(ranks);
            if (ranks.size() > k) {
                ranks.remove(0);
            }
            answer[i] = ranks.get(0);
        }
        return answer;
    }
}