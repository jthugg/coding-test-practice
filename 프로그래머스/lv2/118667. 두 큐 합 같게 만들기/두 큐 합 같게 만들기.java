import java.util.List;
import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        List<Long> q1 = new LinkedList<>();
        List<Long> q2 = new LinkedList<>();
        
        long sum1 = 0L;
        long sum2 = 0L;
        for (int i = 0; i < queue1.length; i++) {
            q1.add((long) queue1[i]);
            q2.add((long) queue2[i]);
            sum1 += (long) queue1[i];
            sum2 += (long) queue2[i];
        }
        
        int count = 0;
        int limit = (q1.size() + q2.size()) * 2;
        
        while (sum1 != sum2) {
            count++;
            if (sum1 > sum2) {
                sum1 -= q1.get(0);
                sum2 += q1.get(0);
                q2.add(q1.get(0));
                q1.remove(0);
                if (count > limit || q1.isEmpty() || q2.isEmpty()) {
                    return -1;
                }
                continue;
            }
            sum2 -= q2.get(0);
            sum1 += q2.get(0);
            q1.add(q2.get(0));
            q2.remove(0);
            if (count > limit || q1.isEmpty() || q2.isEmpty()) {
                return -1;
            }
        }

        return count;
    }
}