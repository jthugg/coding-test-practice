import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

class Solution {
    public int solution(String numbers) {
        
        String[] papers = numbers.split("");
        Arrays.sort(papers, Collections.reverseOrder());
        StringBuilder builder = new StringBuilder();
        
        for (String number : papers) {
            builder.append(number);
        }
        
        int[] filter = new int[Integer.parseInt(builder.toString()) + 1];
        
        filter[0] = 1;
        filter[1] = 1;
        
        for (int i = 2; i * i < filter.length; i++) {
            for (int j = i + i; j < filter.length; j += i) {
                filter[j]++;
            }
        }
        
        int answer = 0;
        
        for (int i = 0; i < filter.length; i++) {
            if (filter[i] == 0 && validate(i, papers)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean validate(int i, String[] papers) {
        
        String[] combination = String.valueOf(i).split("");
        List<String> numbers = new LinkedList<>();
        List<String> used = new LinkedList<>();
        
        for (String paper : papers) {
            numbers.add(paper);
        }
        
        for (String each : combination) {
            int index = numbers.indexOf(each);
            if (index == -1) {
                numbers.addAll(used);
                used.clear();
                return false;
            }
            used.add(each);
            numbers.remove(index);
        }
        
        return true;
    }
}