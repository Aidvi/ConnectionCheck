import java.io.IOException;
import java.net.Socket;

public class CheckConnection {
    Connection con = new Connection();

public void clientConToServer() {

    try {
        Socket socket = new Socket(con.getIp(), con.getPort());
        connectionCheck(socket.isConnected());
    }
    catch (IOException e) {
        System.out.println(e);
    }
}
public void connectionCheck(boolean isConnected){
    if (isConnected){
        System.out.println("there is connection");
    }
    else if(!isConnected){
        System.out.println("no connection");
    }
}

}
