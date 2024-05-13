import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println((Integer.parseInt(sc.next(), sc.nextInt())));
        } finally {
            sc.close();
        }
    }

}
