package Music;
// MusicPlaylist.java
import java.util.LinkedList;

public class MusicPlaylist extends MediaPlayer {
    private LinkedList<String> playlist = new LinkedList<>();

    // Add a song to the playlist
    public void addSong(String song) {
        playlist.addLast(song);
        System.out.println("Added: " + song);
    }

    // Remove the current song from the front
    public void removeCurrentSong() {
        if (!playlist.isEmpty()) {
            String removed = playlist.removeFirst();
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Playlist is empty. Nothing to remove.");
        }
    }

    // Play the next song
    public void playNext() {
        if (!playlist.isEmpty()) {
            String nextSong = playlist.removeFirst();
            playMedia(nextSong); // inherited from MediaPlayer
        } else {
            System.out.println("No songs left to play!");
        }
    }

    // Show all songs in the playlist
    public void showPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist: " + playlist);
        }
    }

    // Main method to test the playlist
    public static void main(String[] args) {
        MusicPlaylist myPlaylist = new MusicPlaylist();

        myPlaylist.addSong("Song A");
        myPlaylist.addSong("Song B");
        myPlaylist.addSong("Song C");

        myPlaylist.showPlaylist();

        myPlaylist.playNext();  // Plays Song A
        myPlaylist.playNext();  // Plays Song B

        myPlaylist.removeCurrentSong(); // Removes Song C

        myPlaylist.playNext();  // No songs left to play
    }
}
