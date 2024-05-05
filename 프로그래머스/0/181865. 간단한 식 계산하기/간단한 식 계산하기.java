class Solution {
    public int solution(String binomial) {
        String[] each = binomial.split(" ");
        return switch (each[1]) {
            case "+" -> Integer.parseInt(each[0]) + Integer.parseInt(each[2]);
            case "-" -> Integer.parseInt(each[0]) - Integer.parseInt(each[2]);
            case "*" -> Integer.parseInt(each[0]) * Integer.parseInt(each[2]);
            default -> 0;
        };
    }
}