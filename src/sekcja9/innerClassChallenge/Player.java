package sekcja9.innerClassChallenge;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Player {
    private static ArrayList<Album> albums = new ArrayList<>();
     private static Album album1 = new Album("Album 1",
            new Song("Track 1", 253),
            new Song("Track 2", 223),
            new Song("Track 3", 213),
            new Song("Track 4", 153),
            new Song("Track 5", 353)
    );
    private static Album album2 = new Album("Java Music For everyone",
            new Song("Intro", 253),
            new Song("Love is everywhere", 223),
            new Song("Programmer's creek", 213),
            new Song("Let the music play", 153),
            new Song("Midnight owl", 353)
    );

    private static PlayList playList = new PlayList("My playlist");

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        albums.add(album1);
        albums.add(album2);
        playList.addSong(albums.get(0).getSongByTracIndex(0));
        playList.addSong(albums.get(0).getSongByTracIndex(2));
        playList.addSong(albums.get(0).getSongByTracIndex(4));
        playList.addSong(albums.get(0).getSongByTracIndex(3));
        playList.addSong(albums.get(1).getSongByTracIndex(4));
        playList.addSong(albums.get(1).getSongByTracIndex(2));
        playList.addSong(albums.get(1).getSongByTracIndex(3));

        ListIterator<Song> iterator = playList.getPlaylist().listIterator();
        iterator.next(); // play first song, set proper index

        String command;
        do {
            printMenu();
            System.out.print("Your option:");
            command = scanner.nextLine();
            switch (command) {
                case "0" :
                    break;
                case "1" :
                    playList.skipNext(iterator);
                    break;
                case "2" :
                    playList.skipPrevious(iterator);
                    break;
                case "3" :
                    playList.replayCurrent(iterator);
                    break;
                case "4" :
                    playList.listSongs();
                    break;
                case "5" :
                    playList.removeCurrentSong(iterator);
                    break;
                default:
                    System.out.println("Unimplemented command.");
            }
        } while (!command.equals("0"));
    }

    private static void printMenu() {
        System.out.println("0 - quit\n" +
                "1 - Skip forward\n" +
                "2 - Skip previous\n" +
                "3 - Replay current song\n" +
                "4 - List songs\n" +
                "5 - Remove current song");
    }

}
