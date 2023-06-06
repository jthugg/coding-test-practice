import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[7];
        while(scanner.hasNext()) {
            counts[scanner.nextInt()]++;
        }
        int value = 0;
        for (int i = 1; i < 7; i++) {
            if (counts[value] <= counts[i]) {
                value = i;
            }
        }
        int count = counts[value];
        if (count == 1) {
            System.out.println(value * 100);
            return;
        }
        System.out.println((int) (Math.pow(10, count + 1) + value * Math.pow(10, count)));
    }
}