import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String solution(String number, int k) {
        
        String[] numbers = number.split("");
        Deque<String> container = new LinkedList<>();
        
        int count = 0;
        
        for (String each : numbers) {
            while (count < k &&
                        !container.isEmpty() &&
                        container.peekLast().compareTo(each) < 0) {
                container.pollLast();
                count++;
            }
            container.addLast(each);
        }
        
        StringBuilder answer = new StringBuilder();
        
        while (!container.isEmpty()) {
            answer.append(container.pollFirst());
        }
        
        return answer.toString().substring(0, answer.length() - k + count);
    }
}