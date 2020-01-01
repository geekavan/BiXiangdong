import java.io.IOException;
import java.io.InputStream;

class Demo22_23 {
    public static void main(String[] args) throws IOException {

        InputStream in  = System.in;

        int ch = in.read();//阻塞式方法
        System.out.println(ch);

        in.close();

        InputStream in0  = System.in;

        int ch1 = in0.read();
        System.out.println(ch1);


        // InputStream in  = System.in;

        // int ch = in.read();//阻塞式方法
        // System.out.println(ch);

        // int ch1 = in.read();
        // System.out.println(ch1);

        // int ch2 = in.read();
        // System.out.println(ch2);

        // System.out.println("'\\r'"+(int)'\r');
        // System.out.println("'\\n'"+(int)'\n');
    }
}