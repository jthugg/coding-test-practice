import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        
        Stack<Integer> sub = new Stack<>();

        int answer = 0;
        
        for (int box = 1, index = 0; box <= order.length; box++) {
            if (box == order[index]) {
                index++;
                answer++;
                continue;
            }
            while (!sub.isEmpty() && sub.peek() == order[index]) {
                sub.pop();
                index++;
                answer++;
            }
            if (sub.isEmpty() || sub.peek() != order[index]) {
                sub.push(box);
            }
        }
        
        while (!sub.isEmpty() && sub.peek() == order[order.length - sub.size()]) {
            sub.pop();
            answer++;
        }
        
        return answer;
    }
}