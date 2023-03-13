import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(String msg) {
        
        Dictionary dic = new Dictionary();
        Queue<Integer> prints = new LinkedList<>();
        int count = 0;
        
        while (count < msg.length()) {
            String[] input = getInputs(dic, msg.substring(count));
            prints.add(dic.get(input[0]));
            dic.add(input[0] + input[1]);
            count += input[0].length();
        }
        
        int[] answer = new int[prints.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = prints.poll();
        }
        
        return answer;
    }
    
    private String[] getInputs(Dictionary dic, String word) {
        
        String now = null;
        
        for (int end = 1; end <= word.length() && dic.has(word.substring(0, end)); end++) {
            now = word.substring(0, end);
        }
        
        if (word.length() == now.length()) {
            return new String[] {now, null};
        }
        
        return new String[] {now, String.valueOf(word.charAt(now.length()))};
    }
}

class Dictionary {
    
    Map<String, Integer> words;
    
    public Dictionary() {
        this.words = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            this.words.put(String.valueOf(c), (int) c - 64);
        }
    }
    
    public boolean has(String word) {
        return this.words.get(word) != null;
    }
    
    public Integer get(String word) {
        return this.words.get(word);
    }
    
    public void add(String word) {
        this.words.put(word, this.words.size() + 1);
    }
}