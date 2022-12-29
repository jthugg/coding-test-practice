import java.util.Arrays;

class Solution {
    public String solution(String s) {
        for (String spell : s.split("")) {
            if (s.length() - s.replaceAll(spell, "").length() != 1) {
                s = s.replaceAll(spell, "");
            }
        }
        char[] spells = s.toCharArray();
        Arrays.sort(spells);
        return String.valueOf(spells);
    }
}