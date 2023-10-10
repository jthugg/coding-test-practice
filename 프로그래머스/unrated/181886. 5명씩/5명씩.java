class Solution {
    public String[] solution(String[] names) {
        int length = (int) Math.ceil((double) names.length / 5);
        String[] answer = new String[length];
        for (int i = 0; i * 5 < names.length; i++) {
            answer[i] = names[i * 5];
        }
        return answer;
    }
}