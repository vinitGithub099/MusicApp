import java.util.ArrayList;

public class ServerMediator implements Mediator {

    private ArrayList<Server> servers;
    private AvailableSongs availableSongs;

    public ServerMediator() {
        servers = new ArrayList<Server>();
        availableSongs = AvailableSongs.getAvailableSongs();
    }

    @Override
    public void addServer(Server s) {
        servers.add(s);
    }

    @Override
    public void findAvailableServer(String songName) {
        boolean foundfreeServer = false;
        for (Server s : servers) {
            if (s.isavailable()) {
                foundfreeServer = true;
                System.out.println("Server " + s.name + " is available.");
                System.out.println(songName + " song downloading from " + s.name + " server .....");
                System.out.println(songName + " song downloaded successfully");
                availableSongs.addDownLoadedSong(songName);
                break;
            }
        }
        if (foundfreeServer == false) {
            System.out.println("No Server is available. Download is not possible. Come again later!");
        }

    }

}
