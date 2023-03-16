import java.util.Set;
import java.util.TreeSet;
import java.time.Duration;
import java.time.LocalTime;

class Solution {
    public String solution(String m, String[] musicInfo) {
        
        String myMelody = m.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a");
        Set<Song> songs = new TreeSet<>();
        
        for (String info : musicInfo) {
            Song song = new Song(songs.size(), info);
            if (song.checkMelody(myMelody)) {
                songs.add(song);
            }
        }
        
        for (Song song : songs) {
            return song.getTitle();
        }
        
        return "(None)";
    }
}

class Song implements Comparable<Song> {
    
    private final int id;
    private final String title;
    private final int duration;
    private final String melody;
    
    public Song(int id, String info) {
        String[] infos = info.split(",");
        this.id = id;
        this.title = infos[2];
        this.duration = (int) Duration.between(LocalTime.parse(infos[0]), LocalTime.parse(infos[1]))
                .getSeconds() / 60;
        infos[3] = infos[3].replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a");
        this.melody = infos[3].repeat(duration / infos[3].length()) +
                infos[3].substring(0, duration % infos[3].length());
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public boolean checkMelody(String melody) {
        return this.melody.contains(melody);
    }
    
    @Override
    public int compareTo(Song song) {
        if (this.duration == song.getDuration()) {
            return this.id - song.getId();
        }
        return song.getDuration() - this.duration;
    }
}