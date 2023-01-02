class Solution {
    boolean solution(String s) {
        return s.toUpperCase().chars().map(i -> {
            if (i == 'P') {
                return 1;
            }
            if (i == 'Y') {
                return -1;
            }
            return 0;
        }).sum() == 0;
    }
}