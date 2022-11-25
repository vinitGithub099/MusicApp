public class Context {
    private State s;
    LoadInterface lsp;


    public Context(String songName) throws Exception {
        s = new Stop();
        lsp = new LoadSongProxy();
        lsp.fetchSong(songName);
    }

    public void setstate(State s) {
        if (s.getClass().getName().equals(this.getstate().getClass().getName())) {
            // System.out.println("Already in " + this.getstate().getClass().getName());
            return;
        }
        this.s = s;
        s.action();
    }

    public State getstate() {
        return s;
    }

}
