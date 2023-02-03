class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] numbers = s.split(" ");
        for (String number : numbers) {
            int value = Integer.parseInt(number);
            if (value >= max) {
                max = value;
            }
            if (value <= min) {
                min = value;
            }
        }
        return min + " " + max;
    }
}