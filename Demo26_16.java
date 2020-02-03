import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

class Demo26_16 {
    public static void main(String[] args) throws IOException {
        //建立客户端Socket对象
        Socket s = new Socket("192.168.1.106",8888);
        System.out.println(s.getInetAddress().getHostAddress()+"......conneted");
        // 获取输出流，并且转换为字符流，加上缓冲区
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"));
        //建立文件对象，建立输入流
        // BufferedReader bufr = new BufferedReader(new FileReader(new File("f:\\tt.txt")));
        BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream(new File("f:\\tt.txt")), "utf-8"));
        String line = null;
        while((line=bufr.readLine())!=null){
            bufOut.write(line+System.getProperty("line.separator"));
            bufOut.flush();
        }
        s.shutdownOutput();
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));
        bufr.close();
        s.close();
    }
}