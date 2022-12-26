import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int[] primes = new int[n + 1];
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                primes[j] = 1;
            }
        }
        return (int) Arrays.stream(primes).filter(i -> i == 1).count();
    }
}