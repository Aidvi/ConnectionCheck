import java.io.IOException;
import java.net.Socket;

public class CheckConnection {
    Connection con = new Connection();

public void clientConToServer() {

    try {
        Socket socket = new Socket(con.getIp(), con.getPort());
        System.out.println("Connection to server is open");
    }
    catch (IOException e) {
        System.out.println(e);
    }
}

}
