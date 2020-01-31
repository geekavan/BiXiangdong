import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo24_63 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("f:\\test.txt"));
        dos.writeUTF("张三");
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("f:\\test.txt"));
        String s = dis.readUTF();
        System.out.println(s);
    }
}