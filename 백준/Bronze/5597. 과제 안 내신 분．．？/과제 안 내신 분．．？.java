import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[31];
        while (scanner.hasNext()) {
            students[scanner.nextInt()]++;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < students.length; i++) {
            if (students[i] == 0) {
                answer.append(i).append("\n");
            }
        }
        System.out.println(answer);
    }
}