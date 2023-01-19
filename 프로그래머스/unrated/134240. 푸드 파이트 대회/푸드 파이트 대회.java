class Solution {
    public String solution(int[] food) {
        StringBuilder head = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            head.append(new StringBuilder(String.valueOf(i).repeat(food[i] / 2)));
        }
        StringBuilder tail = new StringBuilder(head).reverse();
        return head.append('0').append(tail).toString();
    }
}