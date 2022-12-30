import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(Arrays.toString(array).split(""))
            .filter(i -> i.equals("7")).count();
    }
}