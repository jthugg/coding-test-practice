import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String word = new Scanner(System.in).nextLine();
        StringBuilder answer = new StringBuilder();
        
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            answer.append(word.indexOf(alphabet) + " ");
        }
        
        System.out.println(answer.toString().trim());
    }
}