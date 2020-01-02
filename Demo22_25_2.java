import java.io.IOException;
import java.io.InputStream;

class Demo22_25_2 {    
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int ch = in.read();
        System.out.println(ch);
        int ch1 = in.read();
        System.out.println(ch1);
}
}