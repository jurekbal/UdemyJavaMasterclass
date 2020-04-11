package sekcja8.linekdListChallenge;

public class Song {
    private String title;
    private int duration; // in seconds

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
