class Solution {
    public int solution(long num) {
        for (int count = 0; count < 500; count++) {
            if (num == 1) {
                return count;
            }
            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
            num = num * 3 + 1;
        }
        return -1;
    }
}