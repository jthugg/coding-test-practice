import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(factorial(sc.nextLong()));
        } finally {
            sc.close();
        }
    }
    
    private static long factorial(long i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }

}
