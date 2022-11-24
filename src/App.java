public class App {
    public static void main(String[] args) throws Exception {
        
        AvailableSongs avl = AvailableSongs.getAvailableSongs();

        avl.addDownLoadedSong("A");
        avl.addDownLoadedSong("B");
        avl.addDownLoadedSong("C");
        avl.addDownLoadedSong("D");
        avl.addDownLoadedSong("E");

        LoadInterface l = new LoadSongProxy();
        try {
            l.fetchSong("A");
            l.fetchSong("B");
            l.fetchSong("C");
            l.fetchSong("AG");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
