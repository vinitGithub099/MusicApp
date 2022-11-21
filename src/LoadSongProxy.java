public class LoadSongProxy implements LoadInterface {

    private LoadInterface loadSongActual;
    private AvailableSongs availableSongs;

    public LoadSongProxy() {
        availableSongs = AvailableSongs.getAvailableSongs();
    }

    @Override
    public void fetchSong(String songName) throws Exception {

        if (!availableSongs.isSongAvailable(songName)) {
            throw new Exception("Song is not available");
        }

        // Song available, therefore create Actual Implenentation
        this.loadSongActual = new LoadSongImpl();
        loadSongActual.fetchSong(songName);
        
    }


}
