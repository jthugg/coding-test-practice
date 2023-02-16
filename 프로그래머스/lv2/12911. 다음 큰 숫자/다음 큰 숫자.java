class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        if (!binary.contains("0")) {
            return Integer.parseInt("10" + binary.substring(1), 2);
        }
        int trueBits = Integer.bitCount(n);
        for (n += 1; Integer.bitCount(n) != trueBits; n++) {}
        return n;
    }
}