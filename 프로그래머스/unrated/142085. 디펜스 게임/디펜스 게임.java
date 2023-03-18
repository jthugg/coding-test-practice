import java.util.PriorityQueue;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int i = 0; i < enemy.length; i++) {
            heap.add(enemy[i]);
            if (heap.size() > k) {
                n -= heap.poll();
            }
            if (n < 0) {
                return i;
            }
        }
        
        return enemy.length;
    }
}