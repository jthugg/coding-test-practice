class Solution {
    public int solution(int order) {
        return String.valueOf(order).replaceAll("[^3|6|9]", "").length();
    }
}