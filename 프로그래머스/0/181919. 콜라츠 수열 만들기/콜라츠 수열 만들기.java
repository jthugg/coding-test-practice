import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        return getNumbers(new ArrayList<>(), n).stream().mapToInt(i -> i).toArray();
    }
    
    private List<Integer> getNumbers(List<Integer> numbers, int n) {
        if (n == 1) {
            numbers.add(n);
            return numbers;
        }
        if (n % 2 == 0) {
            numbers.add(n);
            return getNumbers(numbers, n  / 2);
        }
        numbers.add(n);
        return getNumbers(numbers, 3 * n + 1);
    }
}