import java.util.regex.Pattern;

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i) - 48]++;
        }
        for (int i = 0; i < Y.length(); i++) {
            yCount[Y.charAt(i) - 48]++;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(xCount[i], yCount[i]); j++) {
                answer.append(i);
            }
        }
        if (Pattern.matches("^[0]+$", answer)) {
            return "0";
        }
        if (answer.length() > 0) {
            return answer.toString();
        }
        return "-1";
    }
}