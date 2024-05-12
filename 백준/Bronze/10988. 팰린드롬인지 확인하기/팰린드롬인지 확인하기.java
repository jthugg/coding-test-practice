import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            char[] arr = sc.next().toCharArray();
            int[] pivots = new int[] {arr.length / 2 - 1, arr.length / 2, 0};
            if (arr.length % 2 == 1) {
                pivots[1]++;
                pivots[2]++;
            }

            while (pivots[0] >= 0) {
                if (arr[pivots[0]] != arr[pivots[1]]) {
                    System.out.println(0);
                    return;
                }
                pivots[0]--;
                pivots[1]++;
            }

            System.out.println(1);
        } finally {
            sc.close();
        }
    }

}
