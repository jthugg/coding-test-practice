import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        String[] bonuses = Arrays.stream(dartResult.split("[0-9]"))
                .filter(i -> !i.equals(""))
                .toArray(String[]::new);
        String[] options = Arrays.stream(bonuses)
                .map(i -> i.replaceAll("[A-Z]", ""))
                .toArray(String[]::new);
        int[] scores = Arrays.stream(dartResult.split("[^0-9]"))
                .filter(i -> !i.equals(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < scores.length; i++) {
            if (bonuses[i].charAt(0) == 'S') {
                scores[i] = scores[i];
            }
            if (bonuses[i].charAt(0) == 'D') {
                scores[i] *= scores[i];
            }
            if (bonuses[i].charAt(0) == 'T') {
                scores[i] *= scores[i] * scores[i];
            }
            if (options[i].equals("*")) {
                scores[i] *= 2;
                if (i != 0) {
                    scores[i - 1] *= 2;
                }
            }
            if (options[i].equals("#")) {
                scores[i] *= -1;
            }
        }
        return Arrays.stream(scores).sum();
    }
}