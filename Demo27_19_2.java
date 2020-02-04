import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Demo27_19_2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8889);
        while(true){
            Socket s = ss.accept();
            new Thread(new ServerTask(s)).start();
        }        
    }
}
class ServerTask implements Runnable{
    private Socket s;
    ServerTask(Socket s){
        this.s = s;
    }

    @Override
    public void run() {
        try{
            int count = 0;
            String ip = s.getInetAddress().getHostAddress();
            InputStream in = s.getInputStream();
            File file = new File("f:\\"+ip+".jpg");
            while(file.exists()){
                file = new File("f:\\"+ip+"("+(++count)+")"+".jpg");
            }
            OutputStream os = new FileOutputStream(file);
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
        }
        catch(IOException e){}
    }
}