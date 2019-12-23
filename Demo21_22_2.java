import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo21_22_2{
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("e://0.mp3");
        BufferedInputStream bufi = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("e://2.mp3");
        BufferedOutputStream bufo = new BufferedOutputStream(fos);

        byte[] b = new byte[1024];

        int len = 0;
        while((len = bufi.read(b))!=-1){
            bufo.write(b,0,len);
        }
        bufo.close();
        bufi.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}