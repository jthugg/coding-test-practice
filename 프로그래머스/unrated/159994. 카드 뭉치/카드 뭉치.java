class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int count1 = 0;
        int count2 = 0;
        int countGoal = 0;
        
        while (countGoal < goal.length) {
            String now = goal[countGoal];
            if (count1 < cards1.length && cards1[count1].equals(now)) {
                count1++;
                countGoal++;
                continue;
            }
            if (count2 < cards2.length && cards2[count2].equals(now)) {
                count2++;
                countGoal++;
                continue;
            }
            return "No";
        }
        
        return "Yes";
    }
}