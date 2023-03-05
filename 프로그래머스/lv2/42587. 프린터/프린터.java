import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int mine = priorities[location];
        Queue<Integer> wait = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            wait.add(priorities[i]);
        }
        while (wait.size() > 0) {
            boolean isPrinted = true;
            int now = wait.poll();
            location--;
            for (int priority : wait) {
                if (priority > now) {
                    if (location == -1) {
                        location = wait.size();
                    }
                    wait.add(now);
                    isPrinted = false;
                    break;
                }
            }
            if (isPrinted) {
                answer++;
            }
            if (location == -1) {
                return answer;
            }
        }
        return answer;
    }
}