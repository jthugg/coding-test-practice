import java.util.stream.IntStream;

class Solution {

    public String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, todo_list.length)
            .filter(index -> !finished[index])
            .mapToObj(index -> todo_list[index])
            .toArray(String[]::new);
    }

}
