class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int addValue = num_list[length - 1] * 2;
        if (num_list[length - 1] > num_list[length - 2]) {
            addValue = num_list[length - 1] - num_list[length - 2];
        }
        int[] answer = new int[length + 1];
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }
        answer[length] = addValue;
        return answer;
    }
}