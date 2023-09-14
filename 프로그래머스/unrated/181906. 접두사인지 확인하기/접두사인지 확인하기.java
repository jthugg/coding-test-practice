class Solution {
    public int solution(String myString, String isPrefix) {
        if (myString.startsWith(isPrefix)) {
            return 1;
        }
        return 0;
    }
}