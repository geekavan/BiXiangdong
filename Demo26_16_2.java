import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Demo26_16_2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("f:\\服务器端文件.txt")),"utf-8"));
        // BufferedWriter bufw = new BufferedWriter(new FileWriter(new File("f:\\服务器端文件.txt")));
        String line = null;
        while((line = bufIn.readLine())!=null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        OutputStream out = s.getOutputStream();
        out.write("上传成功!".getBytes());
        out.close();
        bufw.close();
        s.close();
        ss.close();
    }
}