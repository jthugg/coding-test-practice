class Solution {
    public String[] solution(String my_str, int n) {
        StringBuilder builder = new StringBuilder();
        while (my_str.length() > n) {
            builder.append(my_str.substring(0, n)).append(" ");
            System.out.println(builder);
            my_str = my_str.substring(n, my_str.length());
        }
        return builder.append(my_str).toString().split(" ");
    }
}