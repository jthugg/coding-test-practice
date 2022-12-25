import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(index -> getCounter(index)).collect(Collectors.joining());
    }
    
    private String getCounter(String challenger) {
        if (challenger.equals("2")) {
            return "0";
        }
        if (challenger.equals("0")) {
            return "5";
        }
        return "2";
    }
}