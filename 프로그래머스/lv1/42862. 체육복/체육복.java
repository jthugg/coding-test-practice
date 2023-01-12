import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = 100;
                    reserve[j] = 100;
                }
            }
        }
        Arrays.sort(lost);
        Arrays.sort(reserve);
        if (lost[0] == 1 && reserve[0] == 2) {
            lost[0] = 100;
            reserve[0] = 100;
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j]) {
                    lost[i] = 100;
                    reserve[j] = 100;
                }
                if (lost[i] + 1 == reserve[j]) {
                    lost[i] = 100;
                    reserve[j] = 100;
                }
            }
        }
        int count = 0;
        for (int i : lost) {
            if (i != 100) {
                count++;
            }
        }
        return n - count;
    }
}