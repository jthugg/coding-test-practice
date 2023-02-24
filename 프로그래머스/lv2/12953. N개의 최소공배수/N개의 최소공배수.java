import java.util.Arrays;
import java.math.BigInteger;

class Solution {
    public int solution(int[] arr) {
        return Arrays.stream(arr).reduce((x, y) -> (x * y) / BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue()).getAsInt();
    }
}