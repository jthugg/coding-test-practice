import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int count = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int[] values = new int[] {25, 10, 5, 1};
            while (sc.hasNext()) {
                int change = sc.nextInt();
                for (int value : values) {
                    sb.append(change / value).append(" ");
                    change %= value;
                }
                sb.append("\n");
            }
            System.out.println(sb);
        } finally {
            sc.close();
        }
    }

}
