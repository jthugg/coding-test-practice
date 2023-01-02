class Solution {
    public long solution(int a, int b) {
        return (Math.max(a, b) - Math.min(a, b) + 1) * (long) (a + b) / 2;
    }
}