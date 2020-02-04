import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Demo27_17_2 {
    public static void main(String[] args) throws IOException {
        //建立ServerScoket对象
        ServerSocket ss = new ServerSocket(8889);
        
        //获取Socket对象
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        //获取输入流
        InputStream in = s.getInputStream();
        //建立输出流，与文件相关联
        OutputStream os = new FileOutputStream("f:\\"+ip+".jpg");
        //读写操作
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=in.read(buf))!=-1){
            os.write(buf,0,len);
        }
        //获取输出流
        OutputStream out = s.getOutputStream();
        out.write("上传成功!".getBytes());

        os.close();
        s.close();
        ss.close();
    }
}