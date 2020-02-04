import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

class Demo27_22 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.106",8080);
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("GET /1.html HTTP/1.1");
        out.println("Host: 192.168.1.106:8080");
        // out.println("Connection: keep-alive");
        // out.println("Cache-Control: max-age=0");
        // out.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        // out.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        // out.println("Accept-Encoding: gzip, deflate");
        // out.println("Accept-Language: zh-CN,zh;q=0.9");
        out.println();
        out.println();
        InputStream in = s.getInputStream();
        byte[] buf = new byte[2048];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len,"utf-8"));
        s.close();
    }
}