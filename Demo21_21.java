import java.io.FileOutputStream;
import java.io.IOException;

class Demo21_21{
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("e://fostest.txt");

        fos.write("abcdef".getBytes());
    }
}
