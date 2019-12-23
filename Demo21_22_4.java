import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo21_22_4{
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("e://0.mp3");

        FileOutputStream fos = new FileOutputStream("e://4.mp3");

        int ch = 0;
        while((ch = fis.read())!=-1){
            fos.write(ch);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}