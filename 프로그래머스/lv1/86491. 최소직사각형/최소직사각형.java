class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int i = 0; i < sizes.length; i++) {
            width = Math.max(Math.max(sizes[i][0], sizes[i][1]), width);
            height = Math.max(Math.min(sizes[i][0], sizes[i][1]), height);
        }
        return width * height;
    }
}