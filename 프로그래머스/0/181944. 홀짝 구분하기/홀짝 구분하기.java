import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();
            if (value % 2 == 0) {
                System.out.println(value + " is even");
                return;
            }
            System.out.println(value + " is odd");
        }
    }

}
