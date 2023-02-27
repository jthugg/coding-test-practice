import java.util.Queue;
import java.util.LinkedList;

class Solution {
    
    private Queue<String> cache;
    private int cacheSize;
    
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        int answer = 0;
        this.cacheSize = cacheSize;
        cache = new LinkedList<>();
        for (String city : cities) {
            answer += getTime(city.toLowerCase());
        }
        return answer;
    }
    
    private int getTime(String city) {
        if (checkCache(city)) {
            return 1;
        }
        return 5;
    }
    
    private boolean checkCache(String city) {
        if (cache.contains(city)) {
            cache.remove(city);
            cache.add(city);
            return true;
        }
        if (cache.size() == cacheSize) {
            cache.poll();
        }
        cache.add(city);
        return false;
    }
}