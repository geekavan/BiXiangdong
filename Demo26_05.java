import java.net.InetAddress;
import java.net.UnknownHostException;

class Demo26_05 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}