import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            long[] arr = new long[101];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                int n = sc.nextInt();
                System.out.println(solution(n, arr));
            }
        } finally {
            sc.close();
        }
    }
    
    private static long solution(int n, long[] arr) {
        // fn = f(n - 2) + f(n - 3);
        if (n < 3) {
            return arr[n];
        }
        if (arr[n] == 0) {
            arr[n] = solution(n - 3, arr) + solution(n - 2, arr);
        }
        return arr[n];
    }

}