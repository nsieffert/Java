package udemy_exercises.songs;
import java.util.*;

public class Main {

    private static ArrayList<Album> albums  = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Abbey Road", "Beatles");
        album.addSong("Come Together", 3.10);
        album.addSong("Golden Slumbers", 2.50);
        album.addSong("Old Brown Shoe", 1.59);
        album.addSong("Mean Mr. Mustard", 3.12);
        albums.add(album);

        album = new Album("White", "Beatles");
        album.addSong("Back in the USSR", 3.34);
        album.addSong("Dear Prudence", 3.54);
        album.addSong("Blackbirds", 2.45);
        album.addSong("Ob-La-Di Ob-La-Da", 3.22);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("Old Brown Shoe", playlist);
        albums.get(0).addToPlayList("Golden Slumbers", playlist);
        albums.get(0).addToPlayList("Rubber Soul", playlist); // does not exist
        albums.get(1).addToPlayList(1, playlist);
        albums.get(1).addToPlayList(2, playlist);

        play(playlist);
    }
        private static void play(LinkedList<Song> playlist) {
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean forward = true;
            ListIterator<Song> listIterator = playlist.listIterator();
            if (playlist.size() == 0) {
                System.out.println("No songs in playlist");
                return;
            } else {
                System.out.println("Now Playing: " + listIterator.next().toString());
                printMenu();
            }
            while (!quit) {
                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 0:
                        System.out.println("Playlist complete");
                        quit = true;
                        break;
                    case 1:
                        if (forward) {
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            forward = true;
                        }
                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing " + listIterator.next().toString());
                        } else {
                            System.out.println("You have reached the end of the playlist.");
                            forward = false;
                        }
                        break;
                    case 2:
                        if (forward) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            forward = false;
                        }
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("This is the start of the playlist.");
                            forward = true;
                        }
                        break;
                    case 3:
                        if (forward) {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now replaying: " + listIterator.previous().toString());
                                forward = false;
                            } else {
                                System.out.println("We are at the start of the playlist");
                            }
                        } else {
                            if (listIterator.hasNext()) {
                                System.out.println("Now replaying " + listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("We are at the end of the playlist.");
                            }
                        }
                        break;
                    case 4:
                        printList(playlist);
                        break;
                    case 5:
                        printMenu();
                        break;
                }
            }
        }

                private static void printMenu() {
                    System.out.println("Available Actions: \npress: ");
                    System.out.println("Zero (0) to quit\n" + "one (1) to play the next song \n" +
                            "two (2) to play the previous song\n" +
                            "three (3) to replay the current song\n" +
                            "four (4) to list songs in the playlist\n" +
                            "five (5) to print available actions");
                }

                private static void printList(LinkedList<Song> playlist) {
                    Iterator<Song> iterator = playlist.iterator();
                    System.out.println("===================");
                    while(iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                    System.out.println("===================");
                }

}










