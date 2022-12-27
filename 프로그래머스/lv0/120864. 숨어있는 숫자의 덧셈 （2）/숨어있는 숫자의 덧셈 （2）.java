import java.util.stream.Stream;

class Solution {
    public int solution(String my_string) {
        if (my_string.replaceAll("[^0-9]", "").equals("")) {
            return 0;
        }
        return Stream.of(my_string.replaceAll("[^0-9]", " ").replaceAll("\\s+", " ").trim().split(" ")).mapToInt(i -> Integer.parseInt(i)).sum();
    }
}