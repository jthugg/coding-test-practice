import java.util.stream.Stream;

class Solution {
    public int solution(int n, String control) {
        return n + control.chars().map(command -> {
            if (command == 'w') {
                return 1;
            }
            if (command == 's') {
                return -1;
            }
            if (command == 'd') {
                return 10;
            }
            return -10;
        }).sum();
    }
}