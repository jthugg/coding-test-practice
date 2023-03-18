import java.util.Stack;

class Solution {
    public int solution(int storey) {
        
        Stack<Integer> digits = new Stack<>();
        
        for (char elements : String.valueOf(storey).toCharArray()) {
            digits.push(Character.getNumericValue(elements));
        }
        
        int answer = 0;
        
        while (digits.size() > 1) {
            int digit = digits.pop();
            if (digit > 5 || (digit == 5 && digits.peek() >= 5)) {
                answer += 10 - digit;
                digits.push(digits.pop() + 1);
                continue;
            }
            answer += digit;
        }
        
        if (digits.peek() > 5) {
            return answer + 10 - digits.pop() + 1;
        }
        
        return answer + digits.pop();
    }
}