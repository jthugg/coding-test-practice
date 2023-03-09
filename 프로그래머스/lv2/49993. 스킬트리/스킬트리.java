class Solution {
    public int solution(String skill, String[] trees) {
        
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < trees.length; i++) {
            for (String split : trees[i].split("")) {
                if (skill.contains(split)) {
                    builder.append(split);
                }
            }
            if(skill.startsWith(builder.toString())) {
                answer++;
            }
            builder.setLength(0);
        }
        
        return answer;
    }
}