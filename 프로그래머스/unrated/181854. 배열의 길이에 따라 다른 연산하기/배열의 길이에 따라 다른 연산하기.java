class Solution {
    public int[] solution(int[] arr, int n) {
        int i = 0;
        if (arr.length % 2 == 0) {
            i = 1;
        }
        for (; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }
}