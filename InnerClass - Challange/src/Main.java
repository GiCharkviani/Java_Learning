public class Main {
    public static void main(String[] args) {
        Album myAlbum = new Album("Eminem");

        myAlbum.addSong("Alfred", 2.34);
        myAlbum.addSong("Gnat", 3.4);
        myAlbum.addSong("Stepdad", 5.4);
        myAlbum.addSong("Believe", 6.6);
        myAlbum.addSong("Framed", 3.5);

        Playlist playlist = new Playlist("TheBesties");

        myAlbum.addToPlaylist(playlist, "Gnat");
        myAlbum.addToPlaylist(playlist, "Alfred");
        myAlbum.addToPlaylist(playlist, "Stepdad");
        myAlbum.addToPlaylist(playlist, "Believe");
        myAlbum.addToPlaylist(playlist, "Framed");

        playlist.start();

    }
}
