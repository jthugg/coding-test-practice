import java.math.BigInteger;

class Solution {
    public int solution(int n) {
        
        if (n == 2) {
            return 3;
        }
        
        BigInteger[] lookups = {BigInteger.valueOf(1), BigInteger.valueOf(3)};
        BigInteger answer = BigInteger.valueOf(0);
        
        for (int i = 4; i <= n; i += 2) {
            answer = lookups[1].multiply(BigInteger.valueOf(4)).subtract(lookups[0]);
            lookups[0] = lookups[1];
            lookups[1] = answer;
        }
        
        return answer.remainder(BigInteger.valueOf(1000000007)).intValue();
    }
}