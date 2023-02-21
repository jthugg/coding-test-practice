class Solution {
    public int[] solution(int brown, int yellow) {
        if (yellow == 1) {
            return new int[] {3, 3};
        }
        for (int i = 1, j = yellow; i < yellow; i++, j = yellow / i) {
            if (yellow % i != 0) {
                continue;
            }
            if ((i + 1) * 2 + (j + 1) * 2 == brown) {
                return new int[] {j + 2, i + 2};
            }
        }
        return new int[] {};
    }
}