import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(reader.readLine());
        Map<Integer, String> series = new HashMap<>();
        
        series.put(1, "666");
        
        while (series.size() < target) {
            series.put(series.size() + 1, getTitle(Integer.parseInt(series.get(series.size())) + 1));
        }
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        writer.write(String.valueOf(series.get(series.size())));
        writer.flush();
    }
    
    private static String getTitle(int lastTitle) {
        
        while (!String.valueOf(lastTitle).contains("666")) {
            lastTitle++;
        }
        
        return String.valueOf(lastTitle);
    }
}
