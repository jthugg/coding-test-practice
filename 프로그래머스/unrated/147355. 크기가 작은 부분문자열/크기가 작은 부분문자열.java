import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        BigInteger bigP = new BigInteger(p);
        int pLength = p.length();
        int count = t.length() - pLength;
        int answer = 0;
        for (int i = 0; i <= count; i++) {
            if (new BigInteger(t.substring(i, i + pLength)).compareTo(bigP) == 1) {
                continue;
            }
            answer++;
        }
        return answer;
    }
}