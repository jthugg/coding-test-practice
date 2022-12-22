class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int index = 0; index < num_list.length; index++) {
            answer[num_list.length - index - 1] = num_list[index];
        }
        return answer;
    }
}