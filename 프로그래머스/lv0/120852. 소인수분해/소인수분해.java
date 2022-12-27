import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] numbers = new int[n + 1];
        List<Integer> primes = new ArrayList<>();
        numbers[0] = numbers[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                numbers[j] = 1;
            }
            if (numbers[i] == 0 && n % i == 0) {
                primes.add(i);
            }
        }
        return primes.stream().mapToInt(i -> i).toArray();
    }
}