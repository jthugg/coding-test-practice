import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] dots) {
        List<Double> inclinations = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                double inclination = (double) (dots[i][0] - dots[j][0]) 
                        / (dots[i][1] - dots[j][1]);
                if (inclinations.contains(inclination)) {
                    return 1;
                }
                inclinations.add(inclination);
            }
        }
        return 0;
    }
}