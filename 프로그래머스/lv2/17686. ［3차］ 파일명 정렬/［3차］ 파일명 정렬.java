import java.util.Set;
import java.util.TreeSet;

class Solution {
    public String[] solution(String[] files) {
        
        Set<File> fileSet = new TreeSet<>();
        
        for (int i = 0; i < files.length; i++) {
            fileSet.add(new File(fileSet.size(), files[i]));
        }
        
        String[] answer = new String[files.length];
        int i = 0;
        
        for (File file : fileSet) {
            answer[i] = file.getName();
            i++;
        }
        
        return answer;
    }
}

class File implements Comparable<File> {
    
    private final Integer id;
    private final String name;
    private final String head;
    private final String number;
    
    public File(int id, String name) {
        this.id = id;
        this.name = new String(name);
        this.head = initHead(new String(name)).toLowerCase();
        this.number = initNumber(this.head.length(), new String(name));
    }
    
    private String initHead(String name) {
        int index = 1;
        while (String.valueOf(name.charAt(index)).matches("[^0-9]")) {
            index++;
        }
        return name.substring(0, index);
    }
    
    private String initNumber(int start, String name) {
        int index = start + 1;
        while(index < name.length() && String.valueOf(name.charAt(index)).matches("[0-9]+")) {
            index++;
        }
        return name.substring(start, index);
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getHead() {
        return this.head;
    }
    
    public Integer getNumber() {
        return Integer.parseInt(this.number);
    }
    
    @Override
    public int compareTo(File file) {
        if (this.head.equals(file.getHead())) {
            if (this.getNumber().equals(file.getNumber())) {
                return this.id.compareTo(file.getId());
            }
            return this.getNumber().compareTo(file.getNumber());
        }
        return this.head.compareTo(file.getHead());
    }
}