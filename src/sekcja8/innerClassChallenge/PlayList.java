package sekcja8.innerClassChallenge;

import java.util.ArrayList;
import java.util.ListIterator;

public class PlayList {
    private String title;
    private ArrayList<Song> playlist = new ArrayList<>();
    private Song currentSong;

    public PlayList(String title) {
        this.title = title;
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void skipNext(ListIterator<Song> iterator) {
        if (iterator.hasNext()) {
                currentSong = iterator.next();
                int currentIndex = iterator.previousIndex();
                System.out.println("Now playing: " + (currentIndex+1) + " " + currentSong.getTitle() +
                        " ("+ currentSong.getDuration() + "sec)");
        } else {
            System.out.println("END OF PLAYLIST");
        }
    }

    public void skipPrevious(ListIterator<Song> iterator) {
        if (iterator.previousIndex() > 0) {
                iterator.previous();
                iterator.previous();
                int currentIndex = iterator.nextIndex();
                currentSong = iterator.next();
                System.out.println("Now playing: " + (currentIndex+1) + " " + currentSong.getTitle() +
                        " ("+ currentSong.getDuration() + "sec)");

        } else {
            System.out.println("END OF PLAYLIST");
        }
    }

    public void replayCurrent(ListIterator<Song> iterator) {
        if (!playlist.isEmpty()) {
            if (iterator.previousIndex() == -1) {
                iterator.next();
            }
            currentSong = iterator.previous();
            iterator.next();
            int currentIndex = iterator.previousIndex();
            System.out.println("Now playing: " + (currentIndex+1) + " " + currentSong.getTitle() +
                        " ("+ currentSong.getDuration() + "sec)");
        } else {
            System.out.println("Playlist is empty");
        }
    }

    public void listSongs() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            for (Song s: playlist) {
                System.out.println(s.getTitle()+" ("+s.getDuration()+"sec)");
            }
        }
    }

    public static void removeCurrentSong(ListIterator<Song> iterator) {
        if (iterator.hasPrevious()){
            Song song = iterator.previous();
            iterator.remove();
            System.out.println("Song: " + song.getTitle() + " has been removed.");
        } else {
            System.out.println("Playlist is empty");
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }
}
