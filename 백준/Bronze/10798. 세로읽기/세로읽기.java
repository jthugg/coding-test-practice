import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[][] arr = new String[15][15];
            for (int i = 0; i < 5; i++) {
                String[] iArr = sc.nextLine().split("");
                for (int j = 0; j < iArr.length; j++) {
                    arr[i][j] = iArr[j];
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[j][i] == null) {
                        continue;
                    }
                    sb.append(arr[j][i]);
                }
            }
            System.out.println(sb);
        } finally {
            sc.close();
        }
    }

}
