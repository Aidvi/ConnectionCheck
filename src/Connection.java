public class Connection {
    private static int port;
    private static String ip;

    public Connection(){
        this.port = 8080;
        this.ip = "192.168.1.15";
    }

    public int getPort() {
        return port;
    }

    public String getIp() {
        return ip;
    }

}
