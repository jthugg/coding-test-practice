import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int max = 0;
            int col = 0;
            int row = 0;

            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    int value = sc.nextInt();
                    if (max <= value) {
                        max = value;
                        col = j;
                        row = i;
                    }
                }
            }

            System.out.printf("%s\n%s %s\n", max, row, col);
        } finally {
            sc.close();
        }
    }

}
