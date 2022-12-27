import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        return (Arrays.stream(dots).mapToInt(location -> location[1]).max().getAsInt()
                        - Arrays.stream(dots).mapToInt(location -> location[1]).min().getAsInt())
                * (Arrays.stream(dots).mapToInt(location -> location[0]).max().getAsInt()
                        - Arrays.stream(dots).mapToInt(location -> location[0]).min().getAsInt());
    }
}