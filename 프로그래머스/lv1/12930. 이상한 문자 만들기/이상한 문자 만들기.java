class Solution {
    public String solution(String s) {
        char[] spell = s.toLowerCase().toCharArray();
        for (int i = 0, count = 0; i < spell.length; i++) {
            if (spell[i] == ' ') {
                count = 0;
                continue;
            }
            if (count % 2 == 0) {
                spell[i] = (char) (spell[i] - 32);
            }
            count++;
        }
        return String.valueOf(spell);
    }
}