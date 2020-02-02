import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Demo26_11 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10003);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String text = new String(buf, 0, len);
        System.out.println("服务器端收到的数据______"+text);

        OutputStream os = s.getOutputStream();
        os.write("截至2020年2月1日18时43分，新型冠状病毒已致259人死亡".getBytes());

        s.close();
        ss.close();
    }
}