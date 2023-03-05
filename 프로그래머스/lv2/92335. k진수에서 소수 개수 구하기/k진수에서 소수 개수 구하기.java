import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n, int k) {
        
        String[] splits = Integer.toString(n, k).split("0+");
        List<Long> numbers = new ArrayList<>();
        
        long max = 0L;
        
        for (String split : splits) {
            long number = Long.parseLong(split);
            if (number == 1L || isNonPrime(number)) {
                continue;
            }
            numbers.add(number);
            if (number > max) {
                max = number;
            }
        }
        
        return numbers.size();
    }
    
    private boolean isNonPrime(long number) {
        for (long l = 2; l * l <= number; l++) {
            if (number % l == 0) {
                return true;
            }
        }
        return false;
    }
}