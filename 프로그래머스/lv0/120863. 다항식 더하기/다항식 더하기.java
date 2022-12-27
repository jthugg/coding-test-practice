import java.util.stream.Stream;

class Solution {
    public String solution(String polynomial) {
        int[] result = {
                Stream
                .of((" " + polynomial).replaceAll(" x", " 1x").trim().split(" \\+ "))
                .filter(index -> index.contains("x"))
                .mapToInt(index -> Integer.parseInt(index.replace("x", "")))
                .sum(),
                Stream
                .of((" " + polynomial).replaceAll(" x", " 1x").trim().split(" \\+ "))
                .filter(index -> !index.contains("x"))
                .mapToInt(index -> Integer.parseInt(index.replace("x", "")))
                .sum()
        };
        if (result[0] == 0 && result[1] == 0) {
            return "0";
        }
        if (result[0] == 0) {
            return result[1] + "";
        }
        if (result[1] == 0) {
            if (result[0] == 1) {
                return "x";
            }
            return result[0] + "x";
        }
        if(result[0] == 1) {
            return "x + " + result[1];
        }
        return result[0] + "x + " + result[1];
    }
}