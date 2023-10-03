class Solution {
    public int solution(String myString, String pat) {
        if (myString.contains(pat.replaceAll("A", " ").replaceAll("B", "A").replaceAll(" ", "B"))) {
            return 1;
        }
        return 0;
    }
}