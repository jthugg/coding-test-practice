import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();
            System.out.println(number * 4L);
        } finally {
            sc.close();
        }
    }

}
