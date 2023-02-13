class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        for (answer[0] = 0; s.length() > 1; answer[0]++) {
            int sLength = s.length();
            s = s.replaceAll("0", "");
            answer[1] += sLength - s.length();
            s = Integer.toBinaryString(s.length());
        }
        return answer;
    }
}