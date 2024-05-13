import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int length = 2;
            int count = sc.nextInt();
            for (int i = 0; i < count; i++) {
                length = 2 * length - 1;
            }
            System.out.println(length * length);
        } finally {
            sc.close();
        }
    }

}
