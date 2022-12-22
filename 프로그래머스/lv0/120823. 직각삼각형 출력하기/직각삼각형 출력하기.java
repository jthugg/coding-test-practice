import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int height = 1; height <= n; height++) {
            for (int width = 1; width <= height; width++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}