import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        List<Integer> tri = new ArrayList<>();
        for (; n / 3 != 0; n /= 3) {
            tri.add(n % 3);
        }
        tri.add(n);
        int answer = 0;
        for (int i = 0; i < tri.size(); i++) {
            answer += Math.pow(3, tri.size() - i - 1) * tri.get(i);
        }
        return answer;
    }
}