import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        return (int) Arrays.stream(babbling).mapToInt(i -> i.replace("aya", " ").replace("ye", " ").replace("woo", " ").replace("ma", " ").replaceAll(" ", "").length()).filter(i -> i == 0).count();
    }
}