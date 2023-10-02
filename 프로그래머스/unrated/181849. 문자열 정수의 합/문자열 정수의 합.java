class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (String each : num_str.split("")) {
            answer += Integer.parseInt(each);
        }
        return answer;
    }
}