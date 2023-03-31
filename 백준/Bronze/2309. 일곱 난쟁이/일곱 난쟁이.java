import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        List<Integer> dwarfs = new ArrayList<>();
        int overs = -100;
        
        while (input != null) {
            int now = Integer.parseInt(input);
            dwarfs.add(now);
            overs += now;
            input = reader.readLine();
        }
        
        for (int i = 0; i < dwarfs.size() - 1; i++) {
            for (int j = i + 1; j < dwarfs.size(); j++) {
                if (dwarfs.get(i) + dwarfs.get(j) == overs) {
                    dwarfs.remove(j);
                    dwarfs.remove(i);
                    i = 100;
                    j = 100;
                }
            }
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Collections.sort(dwarfs);
        
        dwarfs.forEach(i -> {
            try {
                writer.write(i + "\n");
                writer.flush();
            } catch (IOException e) {}
        });
        
    }
}