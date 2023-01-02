import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int div) {
        int[] answer = Arrays.stream(arr).filter(index -> index % div == 0).sorted().toArray();
        if (answer.length == 0) {
            return new int[] {-1};
        }
        return answer;
    }
}