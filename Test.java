import java.net.InetAddress;
import java.net.UnknownHostException;

class Test {
    public static void main(String[] args) throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        String name = InetAddress.getLocalHost().getHostName();
        System.out.println(name+"........."+ip);
    }
}