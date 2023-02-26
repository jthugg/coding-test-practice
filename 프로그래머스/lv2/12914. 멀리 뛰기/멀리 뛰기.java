import java.math.BigInteger;

class Solution {
    public long solution(int n) {
        BigInteger[] fi = new BigInteger[] {BigInteger.valueOf(0), BigInteger.valueOf(1)};
        BigInteger answer = fi[0].add(fi[1]);
        for (int i = 0; i < n; i++) {
            answer = fi[0].add(fi[1]);
            fi[0] = fi[1];
            fi[1] = answer;
        }
        return answer.remainder(BigInteger.valueOf(1234567)).longValue();
    }
}