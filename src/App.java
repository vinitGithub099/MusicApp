public class App {
    public static void main(String[] args) throws Exception {

        // AvailableSongs avl = AvailableSongs.getAvailableSongs();

        // avl.addDownLoadedSong("A");
        // avl.addDownLoadedSong("B");
        // avl.addDownLoadedSong("C");
        // avl.addDownLoadedSong("D");
        // avl.addDownLoadedSong("E");

        // LoadInterface li = new LoadSongProxy();
        // // try {
        // li.fetchSong("A");
        // li.fetchSong("B");
        // li.fetchSong("C");
        // li.fetchSong("AG");


        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();

        // li.fetchSong("A");
        // li.fetchSong("B");
        // li.fetchSong("C");
        // li.fetchSong("AG");
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }

        // kartik
        Context k = new Context("A");
        State p = new Play();
        State l = new Stop();
        k.setstate(p);
        k.setstate(p);
        k.setstate(p);
        k.setstate(l);

        // k.setstate(l);
        // p.action(k);
        // System.out.println(k.getstate().toString());
        // l.action(k);
        // System.out.println(k.getstate().toString());
        // p.action(k);
        // System.out.println(k.getstate().toString());

        // twinshu
        // Mediator serverMediator = new ServerMediator();
        // Server s1 = new Server("s1", false);
        // Server s2 = new Server("s2", false);
        // serverMediator.addServer(s1);
        // serverMediator.addServer(s2);
        // serverMediator.findAvailableServer();

    }
}
