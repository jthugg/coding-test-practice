import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] idList, String[] report, int k) {
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        int[] answer = new int[idList.length];
        // List<String> ids = List.of(idList);
        for (String name : idList) {
            List<String> reporters = new ArrayList<>();
            for (String names : report) {
                if (names.substring(names.indexOf(" ") + 1, names.length()).equals(name)) {
                    reporters.add(names.substring(0, names.indexOf(" ")));
                }
            }
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    for (int i = 0; i < idList.length; i++) {
                        if (idList[i].equals(reporter)) {
                            answer[i]++;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}