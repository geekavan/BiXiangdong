import java.net.InetAddress;
import java.net.UnknownHostException;

class Demo26_05_02 {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress ip = InetAddress.getByName("www.mzitu.com");
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}