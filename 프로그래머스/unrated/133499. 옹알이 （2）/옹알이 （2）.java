class Solution {
    public int solution(String[] babbling) {
        String[] my = new String[] {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < 4; j++) {
                babbling[i] = babbling[i].replaceAll(my[j], j + "");
            }
            try {
                Integer.parseInt(babbling[i]);
            } catch (NumberFormatException e) {
                continue;
            }
            answer++;
            for(int j = 1; j < babbling[i].length(); j++) {
                if (babbling[i].charAt(j - 1) == babbling[i].charAt(j)) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}