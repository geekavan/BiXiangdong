import java.net.MalformedURLException;
import java.net.URL;

class Demo27_23 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://192.168.1.106:8080/1.html?name=lisi");
        System.out.println("getProtocol()......"+url.getProtocol());
        System.out.println("getHost()......"+url.getHost());
        System.out.println("getPort()......"+url.getPort());
        System.out.println("getPath()......"+url.getPath());
        System.out.println("getFile()......"+url.getFile());
        System.out.println("getQuery()......"+url.getQuery());
    }
}