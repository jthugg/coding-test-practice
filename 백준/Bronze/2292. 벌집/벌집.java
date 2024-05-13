import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int value = sc.nextInt();
            int n = 0;
            do {
                n++;
            } while (Math.pow(n, 3) -  Math.pow(n - 1, 3) < value);
            System.out.println(n);
        } finally {
            sc.close();
        }
    }

}
