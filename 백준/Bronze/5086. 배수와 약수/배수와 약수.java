import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            while (a != b) {
                try {
                    if (a / b > 0 && a % b == 0) {
                        System.out.println("multiple");
                        continue;
                    }
                    if (b / a > 0 && b % a == 0) {
                        System.out.println("factor");
                        continue;
                    }
                    System.out.println("neither");
                } finally {
                    a = sc.nextInt();
                    b = sc.nextInt();
                }
            }
        } finally {
            sc.close();
        }
    }
}
