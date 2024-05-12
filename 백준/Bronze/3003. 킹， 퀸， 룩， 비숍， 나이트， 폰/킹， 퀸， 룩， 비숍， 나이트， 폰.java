import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = new int[] {1, 1, 2, 2, 2, 8};
            int count = 0;
            StringBuilder sb = new StringBuilder();
            while (sc.hasNext()) {
                int n = sc.nextInt();
                sb.append(arr[count] - n).append(" ");
                count++;
            }
            System.out.println(sb.toString());
        } finally {
            sc.close();
        }
    }

}
