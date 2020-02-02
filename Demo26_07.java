import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class Demo26_07 {
    public static void main(String[] args) throws IOException {
        /**
         * 1.建立Socket对象
         * 2.建立数据报包对象
         * 3.将要发送的数据装入数据报包中，还包括目的地址，端口号等
         * 4.通过Socket发送
         * 5.关闭资源
         */

        System.out.println("发送端开启......");

         //1.建立Socket对象
        DatagramSocket ds = new DatagramSocket();

        //2.建立数据报包对象
        //3.将要发送的数据装入数据报包中，还包括目的地址，端口号等
        byte[] buf = "这里是发送端!".getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.106"),8888);

        //4.通过Socket发送
        ds.send(dp);

        //5.关闭资源
        ds.close();
        
    }
}