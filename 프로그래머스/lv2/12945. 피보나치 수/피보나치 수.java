import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<BigInteger> q = new ArrayList<>();
        q.add(new BigInteger("0"));
        q.add(new BigInteger("1"));
        BigInteger answer = new BigInteger("0");
        for (int i = 0; i < n - 1; i++) {
            answer = q.get(0).add(q.get(1));
            q.set(0, q.get(1));
            q.set(1, answer);
        }
        return answer.remainder(new BigInteger("1234567")).intValue();
    }
}