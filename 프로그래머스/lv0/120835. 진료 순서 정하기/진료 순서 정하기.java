import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] priorities = emergency.clone();
        Arrays.sort(emergency);
        for (int index = 0; index < priorities.length; index++) {
            priorities[index] = priorities.length
                    - Arrays.binarySearch(emergency, priorities[index]);
        }
        return priorities;
    }
}