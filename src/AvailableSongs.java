import java.util.ArrayList;

public class AvailableSongs {
    
    private ArrayList<String> songList;
    private static AvailableSongs availableSongs;

    private AvailableSongs() {
        songList = new ArrayList<>();
    }

    public static AvailableSongs getAvailableSongs() {
        if (availableSongs == null) {
            availableSongs = new AvailableSongs();
        }
        return availableSongs;
    }

    // add the downloaded song to the list of available songs
    public void addDownLoadedSong(String songName) {
        this.songList.add(songName);
    }

    // check if song is availble in the downloaded songs list
    public boolean isSongAvailable(String songName) {
        return this.songList.contains(songName);
    }

    

}
