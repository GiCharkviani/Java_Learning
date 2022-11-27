import java.util.ArrayList;

public class Album {
    private String title;
    private SongsList songs;


    public Album(String title) {
        this.title = title;
        songs = new SongsList();
    }

    // Inner class instead
    private class SongsList {
        ArrayList<Song> songs = new ArrayList<>();

        public void addSong(Song song) {
            songs.add(song);
        }

        public int size() {
            return songs.size();
        }

        public Song get(int i) {
            return songs.get(i);
        }
    }

    public void addSong(String name, double duration) {
        Song song = new Song(name, duration);
        songs.addSong(song);
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
