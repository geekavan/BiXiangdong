import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Demo29_15_16 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getHostAddress());
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));

        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("<html><meta charset='GBK'><body><font color='green' size='7'>注册成功</font></body></html>");

        s.close();
        ss.close();
    }
}