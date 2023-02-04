import java.util.regex.Pattern;

class Solution {
    public String solution(String s) {
        String[] contents = s.toLowerCase().split("");
        StringBuilder answer = new StringBuilder();
        answer.append(contents[0].toUpperCase());
        for (int i = 1; i < contents.length; i++) {
            if (contents[i - 1].isBlank() && Pattern.matches("[a-z]", contents[i])) {
                contents[i] = contents[i].toUpperCase();
            }
            answer.append(contents[i]);
        }
        return answer.toString();
    }
}