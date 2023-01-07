class Solution {
    public int solution(int[] nums) {
        boolean[] primes = new boolean[2998];
        for (int i = 2; i * i < 2997; i++) {
            for (int j = i * i; j < 2997; j += i) {
                primes[j] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (!primes[sum]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}