class Solution {

    public int solution(int[] arr, int idx) {
        for (int index = idx; index < arr.length; index++) {
            if (arr[index] == 1) {
                return index;
            }
        }
        return -1;
    }

}
