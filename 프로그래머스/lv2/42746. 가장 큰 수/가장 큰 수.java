import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public String solution(int[] numbers) {
        
        Set<MyNumber> numSet = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            numSet.add(new MyNumber(numbers[i]));
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (MyNumber number : numSet) {
            builder.append(number.getValue());
        }
        
        String answer = builder.toString();
        
        if (answer.length() > 1 && answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}

class MyNumber implements Comparable<MyNumber> {
    
    private String value;
    private String[] charSet;
    private int length;
    
    public MyNumber(int value) {
        this.value = String.valueOf(value);
        this.charSet = this.value.split("");
        this.length = this.charSet.length;
    }
    
    public String getValue() {
        return value;
    }
    
    public String[] getCharSet() {
        return this.charSet;
    }
    
    public int getLength() {
        return this.length;
    }
    
    @Override
    public int compareTo(MyNumber number) {
        int result = Integer.parseInt(number.getValue() + this.value) -
                Integer.parseInt(this.value + number.getValue());
        if (result == 0) {
            return 1;
        }
        return result;
    }
}