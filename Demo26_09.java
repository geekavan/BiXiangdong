import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class Demo26_09 {
    public static void main(String[] args) throws SocketException {
        DatagramSocket send = new DatagramSocket();
        DatagramSocket rece = new DatagramSocket(3331);
        new Thread(new Send(send)).start();
        new Thread(new Rece(rece)).start();
    }
}

class Send implements Runnable {
    private DatagramSocket ds;

    Send(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            while((line=bufr.readLine())!=null){
                byte[] buf = line.getBytes();
                DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.106"),3331);
                ds.send(dp);
                if("886".equals(line))
                    break;
            }
        }
        catch(Exception e){
        }
        finally{
            ds.close();
        }
    }
}
class Rece implements Runnable{
    private DatagramSocket ds;
    Rece(DatagramSocket ds){
        this.ds = ds;
    }
    @Override
    public void run() {
        try{
            while(true){
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf, buf.length);
                ds.receive(dp);

                String ip = dp.getAddress().getHostAddress();
                int port = dp.getPort();
                String text = new String(dp.getData(),0,dp.getLength());

                if("886".equals(text)){
                    System.out.println(ip+"......"+port+"......"+text);
                    System.out.println(ip+"已经退出群聊");
                    continue;
                }
                System.out.println(ip+"......"+port+"......"+text);
            }
        }
        catch(Exception e){}
        finally{
            ds.close();
        }
    }
}