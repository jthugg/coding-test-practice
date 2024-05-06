import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int sortNumber = getSortNumber(sort_by);
        return Arrays.stream(data)
            .filter(record -> record[getExtNumber(ext)] < val_ext)
            .sorted((record1, record2) -> record1[sortNumber] - record2[sortNumber])
            .toArray(int[][]::new);
    }

    private int getExtNumber(String ext) {
        return switch(ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };
    }
    
    private int getSortNumber(String sort_by) {
        return switch(sort_by) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };
    }
}
