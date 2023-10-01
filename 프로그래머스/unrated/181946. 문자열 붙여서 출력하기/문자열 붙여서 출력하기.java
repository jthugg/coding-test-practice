import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer answer = new StringBuffer();
        answer.append(sc.next()).append(sc.next());
        sc.close();
        System.out.println(answer);
    }
}