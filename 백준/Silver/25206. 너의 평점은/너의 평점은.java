import java.util.Scanner;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Map<String, Double> scores = Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
            );
            double sumOfScores = 0.0;
            double sumOfCredits = 0.0;
            while (sc.hasNext()) {
                String[] arr = sc.nextLine().split(" ");
                if (!arr[2].equals("P")) {
                    double credit = Double.parseDouble(arr[1]);
                    sumOfScores += credit * scores.get(arr[2]);
                    sumOfCredits += credit;
                }
            }
            System.out.println(sumOfScores / sumOfCredits);
        } finally {
            sc.close();
        }
    }

}
