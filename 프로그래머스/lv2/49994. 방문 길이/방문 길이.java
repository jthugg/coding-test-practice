import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        
        Set<String> log = new HashSet<>();
        int[] now = new int[2];
        int answer = 0;
        
        for (String dir : dirs.split("")) {
            String location = now[0] + ", " + now[1];
            int[] moved = move(now, dir);
            if (moved == null) {
                continue;
            }
            if (log.contains(location + dir)) {
                now = moved;
                continue;
            }
            log.add(location + dir);
            log.add(moved[0] + ", " + moved[1] + getReverseDir(dir));
            answer++;
            now = moved;
        }
        
        return answer;
    }
    
    private int[] move(int[] now, String dir) {
        if (dir.equals("U")) {
            if (now[1] + 1 > 5) {
                return null;
            }
            now[1]++;
            return now;
        }
        if (dir.equals("D")) {
            if (now[1] - 1 < -5) {
                return null;
            }
            now[1]--;
            return now;
        }
        if (dir.equals("L")) {
            if (now[0] - 1 < -5) {
                return null;
            }
            now[0]--;
            return now;
        }
        if (now[0] + 1 > 5) {
            return null;
        }
        now[0]++;
        return now;
    }
    
    private String getReverseDir(String dir) {
        if (dir.equals("U")) {
            return "D";
        }
        if (dir.equals("D")) {
            return "U";
        }
        if (dir.equals("L")) {
            return "R";
        }
        return "L";
    }
}