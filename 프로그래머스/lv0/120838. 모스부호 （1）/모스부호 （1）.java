import java.util.List;

class Solution {
    public String solution(String letter) {
        List<String> morseCodes = List.of(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        StringBuilder answer = new StringBuilder();
        for (String eachLetter : letter.split(" ")) {
            answer.append((char) ('a' + morseCodes.indexOf(eachLetter)));
        }
        return answer.toString();
    }
}