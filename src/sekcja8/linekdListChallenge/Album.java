package sekcja8.linekdListChallenge;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songList = new ArrayList<Song>();

    public Album(String title, Song... songs) {
        this.title = title;
        for (Song s : songs) {
            this.songList.add(s);
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public Song getSongByTracIndex(int trackIndex) {
        if (trackIndex < 0 || trackIndex >= songList.size()) {
            return null;
        }
        return songList.get(trackIndex);
    }

}