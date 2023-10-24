import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankData = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankData.put(players[i], i);
        }
        for (String call : callings) {
            int index = rankData.get(call);
            String tmp = players[index - 1];
            players[index - 1] = call;
            players[index] = tmp;
            rankData.put(call, index - 1);
            rankData.put(tmp, index);
        }
        return players;
    }
}