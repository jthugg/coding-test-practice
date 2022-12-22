class Solution {
    public int[] solution(int[] numbers) {
        for(int index = 0; index < numbers.length; index++) {
            numbers[index] *= 2;
        }
        return numbers;
    }
}