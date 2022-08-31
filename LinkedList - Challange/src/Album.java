import java.util.ArrayList;

public class Album {
    private String title;
    ArrayList<Song> songs = new ArrayList<>();

    public Album(String title) {
        this.title = title;
    }

    public void addSong(String name, double duration) {
        Song song = new Song(name, duration);
        songs.add(song);
    }

    public void addToPlaylist(Playlist playlist, String songName) {
        Song foundSong = getSong(songName);
        if(foundSong == null) {
            System.out.println("Song " + songName + " doesn't exit in the album  " + title);
        } else {
            playlist.addSong(foundSong);
        }
    }


    private Song getSong(String name) {
        return findSong(name);
    }

    private Song findSong(String name) {
        for(int i = 0; i < songs.size(); i++) {
            if(songs.get(i).getTitle().equals(name))
                return songs.get(i);
        }
        return null;
    }


}
