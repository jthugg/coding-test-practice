class Solution {
    public String solution(String number) {
        return "*".repeat(number.length() - 4)
                + number.substring(number.length() - 4, number.length());
    }
}