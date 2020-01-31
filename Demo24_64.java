import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

class Demo24_64 {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("abcde".getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];
        int len = bais.read(buff);
        baos.write(buff, 0, len);
        System.out.println(baos.toString());
    }
}