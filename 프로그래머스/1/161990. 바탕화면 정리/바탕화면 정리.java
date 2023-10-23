class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = findTop(wallpaper);
        answer[1] = findLeft(wallpaper);
        answer[2] = findBottom(wallpaper);
        answer[3] = findRight(wallpaper);
        return answer;
    }
    
    private int findTop(String[] wall) {
        for (int i = 0; i < wall.length; i++) {
            if (wall[i].contains("#")) {
                return i;
            }
        }
        return 0;
    }
    
    private int findLeft(String[] wall) {
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < wall.length; i++) {
            int index = wall[i].indexOf("#");
            if (index != -1 && value > index) {
                value = index;
            }
        }
        return value;
    }
    
    private int findBottom(String[] wall) {
        for (int i = wall.length - 1; i > -1; i--) {
            if (wall[i].contains("#")) {
                return ++i;
            }
        }
        return 0;
    }
    
    private int findRight(String[] wall) {
        int value = 0;
        for (int i = 0; i < wall.length; i++) {
            int index = wall[i].lastIndexOf("#");
            if (index != -1 && value < index) {
                value = index;
            }
        }
        return ++value;
    }
}