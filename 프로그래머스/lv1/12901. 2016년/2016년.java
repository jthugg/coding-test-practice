import java.util.stream.IntStream;

class Solution {
    public String solution(int a, int b) {
        return new String[] {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"}[(IntStream.range(0, a).map(i -> new int[] {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30}[i]).sum() + b) % 7];
    }
}