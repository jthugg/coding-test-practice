class Solution {
    public String solution(int[] numbers, String hand) {
        char prefer = hand.toUpperCase().charAt(0);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 11;
            }
        }
        int[] left = new int[] {3, 0};
        int[] right = new int[] {3, 2};
        StringBuilder answer = new StringBuilder();
        for (int number : numbers) {
            if (number == 3 || number == 6 || number == 9) {
                right[0] = number / 3 - 1;
                right[1] = 2;
                answer.append('R');
                continue;
            }
            if (number == 1 || number == 4 || number == 7) {
                left[0] = number / 3;
                left[1] = 0;
                answer.append('L');
                continue;
            }
            int[] target = new int[] {number / 3, 1};
            answer.append(getHand(left, right, target, hand));
        }
        return answer.toString();
    }
    
    private String getHand(int[] left, int[] right, int[] target, String hand) {
        int distanceL = Math.abs(left[0] - target[0])
                + Math.abs(left[1] - target[1]);
        int distanceR = Math.abs(right[0] - target[0])
                + Math.abs(right[1] - target[1]);
        if (distanceL > distanceR) {
            right[0] = target[0];
            right[1] = target[1];
            return "R";
        }
        if (distanceL < distanceR) {
            left[0] = target[0];
            left[1] = target[1];
            return "L";
        }
        if (hand.equals("left")) {
            left[0] = target[0];
            left[1] = target[1];
            return "L";
        }
        if (hand.equals("right")) {
            right[0] = target[0];
            right[1] = target[1];
            return "R";
        }
        return  " ";
    }
}