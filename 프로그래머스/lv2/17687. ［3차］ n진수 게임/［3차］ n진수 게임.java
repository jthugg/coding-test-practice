class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder numbers = new StringBuilder();
        for (int i = 0, count = 1; numbers.length() < t; i++) {
            for (String index : Integer.toString(i, n).split("")) {
                if (count == p) {
                    numbers.append(index);
                }
                if (numbers.length() == t) {
                    break;
                }
                if (count == m) {
                    count = 1;
                    continue;
                }
                count++;
            }
        }
        return numbers.toString().toUpperCase();
    }
}