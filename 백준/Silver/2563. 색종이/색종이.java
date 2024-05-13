import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int count = sc.nextInt();
            int[][] arr = new int[100][100];
            int answer = 0;
            for (int i = 0; i < count; i++) {
                answer += countBlack(arr, sc.nextInt(), sc.nextInt());
            }
            System.out.println(answer);
        } finally {
            sc.close();
        }
    }
    
    static int countBlack(int[][] arr, int x, int y) {
        int count = 0;
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j]++;
                    count++;
                }
            }
        }
        return count;
    }

}
