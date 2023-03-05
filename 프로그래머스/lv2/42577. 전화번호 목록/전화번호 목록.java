import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; phone_book[j].startsWith(phone_book[i]); j++) {
                return false;
            }
        }
        return true;
    }
}