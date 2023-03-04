import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> publishes = new ArrayList<>();
        Stack<Integer> jobs = new Stack<>();
        
        jobs.push((int) Math.ceil((100.0 - progresses[0]) / speeds[0]));
        
        for (int i = 1; i < speeds.length; i++) {
            int duration = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            if (jobs.peek() >= duration) {
                jobs.push(jobs.peek());
                continue;
            }
            publishes.add(jobs.size());
            jobs.clear();
            jobs.push(duration);
        }
        
        publishes.add(jobs.size());
        
        int[] answer = new int[publishes.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = publishes.get(i);
        }
        
        return answer;
    }
}