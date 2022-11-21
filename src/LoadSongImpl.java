public class LoadSongImpl implements LoadInterface {


    @Override
    public void fetchSong(String songName) throws Exception {
        System.out.println(songName + " song successfully fetched from the downloaded list");    
    }
    
}
