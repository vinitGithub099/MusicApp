public class LoadSongProxy implements LoadInterface {

    private LoadInterface loadSongActual;
    private AvailableSongs availableSongs;
    private Mediator serverMediator;
    private Server s1;
    private Server s2;

    public LoadSongProxy() {
        availableSongs = AvailableSongs.getAvailableSongs();
        serverMediator = new ServerMediator();
        s1 = new Server("s1", true);
        s2 = new Server("s2", true);
        serverMediator.addServer(s1);
        serverMediator.addServer(s2);
    }

    @Override
    public void fetchSong(String songName) throws Exception {

        try {
            if (!availableSongs.isSongAvailable(songName)) {
                throw new Exception("Song is not available");
            }
        } catch (Exception e) {
            serverMediator.findAvailableServer(songName);
        }

        // Song available, therefore create Actual Implenentation
        this.loadSongActual = new LoadSongImpl();
        loadSongActual.fetchSong(songName);

    }

}
