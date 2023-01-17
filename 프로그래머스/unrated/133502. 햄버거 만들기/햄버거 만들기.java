import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        for (int i : ingredient) {
            stack.add(i);
            if (stack.size() >= 4
                && stack.get(stack.size() - 1) == 1
                && stack.get(stack.size() - 2) == 3
                && stack.get(stack.size() - 3) == 2
                && stack.get(stack.size() - 4) == 1) {
                for (int j = 0; j < 4; j++) {
                    stack.remove(stack.size() - 1);
                }
                answer++;
            }
        }
        return answer;
    }
}