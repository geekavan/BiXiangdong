import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class Demo27_23_2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://192.168.1.106:8080/1.html?name=lisi");
        URLConnection conn = url.openConnection();
        InputStream in = conn.getInputStream();
        byte[] buf = new byte[1024];
        int len =in.read(buf);
        System.out.println(new String(buf,0,len,"utf-8"));
        in.close();
    }
}