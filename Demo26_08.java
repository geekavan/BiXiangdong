import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

class Demo26_08 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.建立Socket接收端，并记得输入接收端口
         * 2.建立数据报包对象，用于接收数据
         * 3.接收数据
         * 4.关闭资源
         */

        System.out.println("接收端开启......");
        //建立Socket接收端，并记得输入接收端口
        DatagramSocket ds = new DatagramSocket(8888);

        //2.建立数据报包对象，用于接收数据
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);

        //3.接收数据
        ds.receive(dp);

        //4.关闭资源
        ds.close();

        String s = new String(buf,0,dp.getLength());
        System.out.println(s);
    }
}