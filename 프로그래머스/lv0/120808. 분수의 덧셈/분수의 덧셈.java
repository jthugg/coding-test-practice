import java.math.BigInteger;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        return makeIreducibleFraction((denum1 * num2) + (denum2 * num1), (num1 * num2));
    }
    
    private int[] makeIreducibleFraction(int denum, int num) {
        int gcd = BigInteger.valueOf(num).gcd(BigInteger.valueOf(denum)).intValue();
        return new int[] {denum / gcd, num / gcd};
    }
}