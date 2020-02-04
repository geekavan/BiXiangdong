import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Demo27_21 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9528);
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));
        OutputStream out = s.getOutputStream();
        out.write(8);
        out.flush();
        s.close();
        ss.close();
    }
}