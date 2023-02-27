import java.util.Stack;

class Solution {    
    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        if (length % 2 == 1) {
            return 0;
        }
        StringBuilder rotated = new StringBuilder();
        for (int i = 0; i < length; i++) {
            rotated.append(s.substring(i, length)).append(s.substring(0, i));
            answer += check(rotated.toString().toCharArray());
            rotated.setLength(0);
        }
        return answer;
    }
    
    private int check(char[] rotated) {
        Stack<Character> braces = new Stack<>();
        for (char brace : rotated) {
            if (braces.isEmpty() || brace == '(' || brace == '{' || brace == '[') {
                braces.push(brace);
                continue;
            }
            if (brace - braces.peek() == 1 || brace - braces.peek() == 2) {
                braces.pop();
                continue;
            }
            return 0;
        }
        if (braces.isEmpty()) {
            return 1;
        }
        return 0;
    }
}