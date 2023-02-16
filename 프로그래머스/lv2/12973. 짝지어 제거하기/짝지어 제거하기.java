import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char alph = s.charAt(i);
            if (!stack.empty() && stack.peek() == alph) {
                stack.pop();
                continue;
            }
            stack.push(alph);
        }
        if (stack.empty()) {
            return 1;
        }
        return 0;
    }
}