import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo21_22_3{
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("e://0.mp3");
        BufferedInputStream bufi = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("e://3.mp3");
        BufferedOutputStream bufo = new BufferedOutputStream(fos);

        int ch = 0;
        while((ch = bufi.read())!=-1){
            bufo.write(ch);
        }

        bufo.close();
        bufi.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}