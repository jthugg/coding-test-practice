class Solution {
    public int solution(int[] nums) {
        if (nums.length > 10) {
            for (int i = 1; i < nums.length; i++) {
                nums[0] += nums[i];
            }
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            nums[0] *= nums[i];
        }
        return nums[0];
    }
}