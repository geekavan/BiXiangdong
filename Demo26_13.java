import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import java.io.InputStream;

class Demo26_13 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.建立客户端Socket对象
         * 2.获取输出流对象 
         * 3.建立键盘输入流
         * 4.获取键盘输入数据，打印到输出流中
         * 5.获取输入流对象，读取服务器端发送来的数据
         * 6.关流
         */
        Socket s = new Socket("192.168.1.106",10007);
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        InputStream in = s.getInputStream();
        String line = null;
        while ((line = bufr.readLine()) != null) {
            if("over".equals(line))
                break;
            // bufOut.write(line+System.getProperty("line.separator"));
            bufOut.write(line+"\r\n");
            bufOut.flush();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf,0,len));
        }
        s.close();
    }
}