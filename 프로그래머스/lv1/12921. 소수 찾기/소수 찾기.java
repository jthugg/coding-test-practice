class Solution {
    public int solution(int n) {
        int[] primes = new int[n + 1];
        int primeCount = n;
        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                if (primes[j] != 0) {
                    continue;
                }
                primes[j]++;
                primeCount--;
            }
        }
        return primeCount - 1;
    }
}