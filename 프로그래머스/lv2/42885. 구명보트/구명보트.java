import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> members = new ArrayDeque<>();
        for (int i = 0; i < people.length; i++) {
            members.push(people[i]);
        }
        while (!members.isEmpty()) {
            if (members.peekLast() > limit / 2) {
                break;
            }
            int sum = members.peekFirst() + members.peekLast();
            if (sum > limit) {
                members.pollFirst();
                answer++;
                continue;
            }
            members.pollFirst();
            members.pollLast();
            answer++;
        }
        return answer + members.size();
    }
}