import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        List<String> alphabets = new LinkedList<>();
        
        alphabets.add("c=");
        alphabets.add("c-");
        alphabets.add("dz=");
        alphabets.add("d-");
        alphabets.add("lj");
        alphabets.add("nj");
        alphabets.add("s=");
        alphabets.add("z=");
        
        for (String s : alphabets) {
            word = word.replaceAll(s, " ");
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(word.length()));
        writer.flush();
    }
}