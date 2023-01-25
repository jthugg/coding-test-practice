class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int myNumber = 1; myNumber <= number; myNumber++) {
            int atk = 0;
            if (Math.sqrt(myNumber) % 1.0 == 0) {
                atk++;
            }
            for (int i = 1; i * i < myNumber; i++) {
                if (myNumber % i == 0) {
                    atk += 2;
                }
            }
            if (atk > limit) {
                answer += power;
                continue;
            }
            answer += atk;
        }
        return answer;
    }
}