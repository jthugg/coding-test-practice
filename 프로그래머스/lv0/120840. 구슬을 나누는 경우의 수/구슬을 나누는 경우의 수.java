import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger left = BigInteger.ONE;
        BigInteger right = BigInteger.ONE;
        for (; share > 0; balls--, share--) {
            left = BigInteger.valueOf(balls).multiply(left);
            right = BigInteger.valueOf(share).multiply(right);
        }
        return left.divide(right).intValue();
    }
}