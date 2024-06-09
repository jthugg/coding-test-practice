import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int target = sc.nextInt();
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 1, j = 0; i <= target && j < length; i++) {
                if (target % i == 0) {
                    arr[j] = i;
                    j++;
                }
            }
            System.out.println(arr[arr.length - 1]);
        } finally {
            sc.close();
        }
    }
}
