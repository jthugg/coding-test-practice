import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz).map(i -> {
            String[] splitIndex = i.split(" ");
            if (splitIndex[1].equals("+")) {
                if (Integer.parseInt(splitIndex[0])
                        + Integer.parseInt(splitIndex[2])
                        == Integer.parseInt(splitIndex[4])) {
                    return "O";
                }
                return "X";
            }
            if (Integer.parseInt(splitIndex[0])
                        - Integer.parseInt(splitIndex[2])
                        == Integer.parseInt(splitIndex[4])) {
                    return "O";
                }
                return "X";
        }).toArray(String[]::new);
    }
}