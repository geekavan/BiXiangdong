import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class Demo27_17 {
    public static void main(String[] args) throws IOException {
        //建立Socket对象
        Socket s = new Socket("192.168.1.106",8889);
        //获取输出流
        OutputStream out = s.getOutputStream();
        //建立输入流，关联图片
        InputStream is = new FileInputStream(new File("f:\\0.jpg"));
        //读写操作
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=is.read(buf))!=-1){
            out.write(buf,0,len);
        }
        //发送数据结束，告诉服务器端
        s.shutdownOutput();
        //获取输入流，接收服务器端发送的数据
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int lenIn = in.read(bufIn);
        System.out.println(new String(bufIn, 0, lenIn));

        in.close();
        is.close();
        s.close();
    }
}