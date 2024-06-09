import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int weight = sc.nextInt();
            int answer = Integer.MAX_VALUE;
            for (int i = 0; i * 5 <= weight; i++) {
                for (int j = 0; j * 3 <= weight - (i * 5); j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    if (weight == (i * 5) + (j * 3)) {
                        answer = Math.min(i + j, answer);
                    }
                }
            }
            if (answer == Integer.MAX_VALUE) {
                System.out.println(-1);
                return;
            }
            System.out.println(answer);
        } finally {
            sc.close();
        }
    }

}
