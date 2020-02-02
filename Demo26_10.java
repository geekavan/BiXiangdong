import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class Demo26_10 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.106",10003);
        OutputStream os = s.getOutputStream();
        os.write("我想要查找新型冠状病毒的最新消息".getBytes());

        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String text = new String(buf,0,len);
        System.out.println("客户端接收到的数据______"+text);
        s.close();
    }
}