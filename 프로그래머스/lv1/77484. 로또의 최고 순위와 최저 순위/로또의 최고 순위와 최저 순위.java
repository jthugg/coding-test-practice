class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int minRank = 0;
        int zeroCount = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    minRank++;
                    break;
                }
            }
        }
        int[] rank = new int[] {6, 6, 5, 4, 3, 2, 1};
        return new int[] {rank[minRank + zeroCount], rank[minRank]};
    }
}