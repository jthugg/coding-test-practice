class Solution {
    public int solution(int n) {
        int number = 1;
        for (; n > 0; number++, n--) {
            if (number % 3 == 0 || String.valueOf(number).contains("3")) {
                n++;
            }
        }
        return number - 1;
    }
}