import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Demo24_62 {
    public static void main(String[] args) throws IOException {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        in.connect(out);
        new Thread(new Input(in)).start();
        new Thread(new Output(out)).start();
    }
}

class Input implements Runnable {

    private PipedInputStream in;

    Input(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        byte[] buff = new byte[1024];
        try {
            int len = in.read(buff);
            String s = new String(buff, 0, len);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Output implements Runnable{
    private PipedOutputStream out;
    Output(PipedOutputStream out){
        this.out = out;
    }
    public void run(){
        try {
            Thread.sleep(5000);
            out.write("zhangsan".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}