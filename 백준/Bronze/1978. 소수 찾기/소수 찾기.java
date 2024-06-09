import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] filter = getFilter(1001);

            int length = sc.nextInt();
            int answer = 0;
            while (sc.hasNext()) {
                if (filter[sc.nextInt()] == 0) {
                    answer++;
                }
            }

            System.out.println(answer);
        } finally {
            sc.close();
        }
    }

    private static int[] getFilter(int length) {
        int[] filter = new int[length];
        filter[0]++;
        filter[1]++;
        for (int i = 2; i < length; i++) {
            for (int j = 2; i * j < length; j++) {
                filter[i * j]++;
            }
        }
        return filter;
    }

}
