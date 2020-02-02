import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Demo26_14 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10007);
        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getHostAddress()+"......connected");
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        OutputStream out = s.getOutputStream();
        String line = null;
        while((line=bufIn.readLine())!=null){
            System.out.println(line);
            out.write(line.toUpperCase().getBytes());
        }
        s.close();
        ss.close();
    }
}