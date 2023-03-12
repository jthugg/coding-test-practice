class Solution {
    public long[] solution(long[] numbers) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]++;
                continue;
            }
            String binary = "0" + Long.toString(numbers[i], 2);
            if (binary.endsWith("01")) {
                numbers[i]++;
                continue;
            }
            int index = binary.lastIndexOf("01");
            numbers[i] += Long.parseLong("10" + binary.substring(index + 2), 2) -
                    Long.parseLong(binary.substring(index), 2);
        }

        return numbers;
    }
}