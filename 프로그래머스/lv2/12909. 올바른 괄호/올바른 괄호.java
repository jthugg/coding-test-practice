class Solution {
    boolean solution(String s) {
        int checker = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                checker++;
                continue;
            }
            checker--;
            if (checker < 0) {
                return false;
            }
        }
        return checker == 0;
    }
}