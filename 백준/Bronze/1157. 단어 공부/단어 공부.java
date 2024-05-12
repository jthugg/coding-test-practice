import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String value = sc.next().toUpperCase();
            int max = 0;
            String answer = null;

            for (char c = 'A'; c <= 'Z'; c++) {
                String now = String.valueOf(c);
                int originLength = value.length();
                value = value.replaceAll(now, "");
                int count = originLength - value.length();

                if (max == count) {
                    answer = "?";
                }
                if (max < count) {
                    max = count;
                    answer = now;
                }
            }

            System.out.println(answer);
        } finally {
            sc.close();
        }
    }

}
