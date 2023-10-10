import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] pre = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] post = Arrays.copyOfRange(num_list, 0, n);
        int[] answer = new int[pre.length + post.length];
        for (int i = 0; i < pre.length; i++) {
            answer[i] = pre[i];
        }
        for (int i = 0; i < post.length; i++) {
            answer[i + pre.length] = post[i];
        }
        return answer;
    }
}