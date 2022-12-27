import java.math.BigInteger;

class Solution {
    public int solution(int a, int b) {
        if (a % b == 0) {
            return 1;
        }
        int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
        a /= gcd;
        b /= gcd;
        while (b / 2 != 0 && b % 2 == 0) {
            b /= 2;
        }
        while (b / 5 != 0 && b % 5 == 0) {
            b /= 5;
        }
        if (b == 1) {
            return 1;
        }
        return 2;
    }
}