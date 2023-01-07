import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        return new int[] {
            BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue(),
            n * m / BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue()
        };
    }
}