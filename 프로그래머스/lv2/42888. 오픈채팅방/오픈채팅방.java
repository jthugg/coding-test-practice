import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        
        Map<String, User> db = new HashMap<>();
        List<History> histories = new ArrayList<>();
        
        for(String log : record) {
            String[] data = log.split(" ");
            User user = db.get(data[1]);
            if (data[0].equals("Enter")) {
                if (user == null) {
                    user = new User(data[2]);
                    db.put(data[1], user);
                    histories.add(new History("Enter", user));
                    continue;
                }
                user.setNickname(data[2]);
                histories.add(new History("Enter", user));
                continue;
            }
            if (data[0].equals("Leave")) {
                histories.add(new History("Leave", user));
                continue;
            }
            user.setNickname(data[2]);
        }

        String[] answer = new String[histories.size()];
        
        for(int i = 0; i < answer.length; i++) {
            History log = histories.get(i);
            if (log.getAction().equals("Enter")) {
                answer[i] = log.getUser().getNickname() + "님이 들어왔습니다.";
                continue;
            }
            answer[i] = log.getUser().getNickname() + "님이 나갔습니다.";
        }
        
        return answer;
    }
}

class User {
    
    private String nickname;
    
    public User(String nickname) {
        this.nickname = nickname;
    }
    
    public String getNickname() {
        return this.nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

class History {
    
    private final String action;
    private final User user;
    
    public History(String action, User user) {
        this.action = action;
        this.user = user;
    }
    
    public String getAction() {
        return this.action;
    }
    
    public User getUser() {
        return this.user;
    }
}