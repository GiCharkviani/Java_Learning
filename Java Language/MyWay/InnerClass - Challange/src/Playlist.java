import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String name;
    private LinkedList<Song> songs = new LinkedList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean addSong(Song song) {
        ListIterator<Song> listIterator = songs.listIterator();
        while(listIterator.hasNext()) {
            int comparer = listIterator.next().getTitle().compareTo(song.getTitle());
            if(comparer == 0) {
                System.out.println("The song " + song.getTitle() + " already includes in playlist - " + name);
                return false;
            } else if(comparer > 0) {
                listIterator.previous();
                listIterator.add(song);
                return true;
            }
        }
        listIterator.add(song);
        return true;
    }


    public void start() {
        ListIterator<Song> listIterator = songs.listIterator();
        boolean quit;
        boolean goingForward = true;

        if(songs.isEmpty()) {
            quit = true;
            System.out.println("No songs in Playlist");
        }
        else {
            quit = false;
            System.out.println("Now visiting " + listIterator.next().getTitle() + " song");
            printMenu();
        }

        while(!quit) {
            Scanner scanner = new Scanner(System.in);
            int userChoice =  scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 0:
                    System.out.println("Quiting...");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        Song currentSong = listIterator.next();
                        System.out.println("You are at " + currentSong.getTitle()
                                + " song (Duration: " +
                                currentSong.getDuration() + ")");
                    } else
                        System.out.println("You reached to the end of the Playlist");
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        Song currentSong = listIterator.previous();
                        System.out.println("You are at " + currentSong.getTitle()
                                + " song (Duration: " +
                                currentSong.getDuration() + ")");
                    } else
                        System.out.println("You are at start");
                    break;
                case 3:
                    listIterator.remove();
                    System.out.println("Song was removed");
                    break;
                case 4:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Playing song " + listIterator.previous().getTitle());
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Playing song " + listIterator.next().getTitle());
                        }
                    }
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }

    }

    private void printMenu() {
        System.out.println("\n Pick an option:" +
                "\n\t0 - Quit" +
                "\n\t1 - Skip Forward" +
                "\n\t2 - Skip Backward" +
                "\n\t3 - Remove Current Song" +
                "\n\t4 - Play Current Song" +
                "\n\t5 - Print Menu");
    }


}
