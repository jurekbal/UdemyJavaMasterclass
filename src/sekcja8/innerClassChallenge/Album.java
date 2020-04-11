package sekcja8.innerClassChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Album {
    private String title;
    private SongList songList;

    public Album(String title, Song... songs) {
        this.title = title;
        this.songList = new SongList();
        this.songList.addSongs(songs);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongList() {
        return songList.getSongList();
    }

    public Song getSongByTracIndex(int trackIndex) {
        if (trackIndex < 0 || trackIndex >= songList.getSongList().size()) {
            return null;
        }
        return songList.getSongList().get(trackIndex);
    }

    private class SongList {
        private ArrayList<Song> songList;

        public SongList() {
            this.songList = new ArrayList<>();
        }

        public ArrayList<Song> getSongList() {
            return songList;
        }

        public void addSongs(Song[] songs) {
            songList.addAll(Arrays.asList(songs));
        }

    }

}