import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        List<Integer> map = new ArrayList<>();
        for (int i = 0; i <= Math.max(numlist[numlist.length - 1] - n, n - numlist[0]); i++) {
            if (list.contains(n + i)) {
                map.add(n + i);
            }
            if (i != 0 && list.contains(n - i)) {
                map.add(n - i);
            }
        }
        return map.stream().mapToInt(i -> i).toArray();
    }
}