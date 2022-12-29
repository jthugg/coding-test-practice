import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        for (int i = array.length - 1, distance = 100; i >= 0; i--) {
            if (Math.abs(n - array[i]) <= distance) {
                distance = Math.abs(n - array[i]);
                array[array.length - 1] = array[i];
            }
        }
        return array[array.length - 1];
    }
}