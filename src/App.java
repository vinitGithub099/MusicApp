import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        AvailableSongs avl = AvailableSongs.getAvailableSongs();
        avl.addDownLoadedSong("s");
        avl.addDownLoadedSong("t");
        avl.addDownLoadedSong("su");
        avl.addDownLoadedSong("Gallan");
    
        System.out.println("Input song name to play:");
        Scanner sc = new Scanner(System.in);
        String songName = sc.nextLine();
        Context k = new Context(songName);
        State p = new Play();
        State l = new Stop();
        k.setstate(p);
        k.setstate(p);
        k.setstate(p);
        k.setstate(l);
        
        sc.close();
    

    }
}
