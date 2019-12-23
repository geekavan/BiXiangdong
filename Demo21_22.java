import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo21_22{
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("e://0.mp3");
        FileOutputStream fos = new FileOutputStream("e://1.mp3");

        byte[] b = new byte[1024];

        int len = 0;
        while((len = fis.read(b))!=-1){
            fos.write(b,0,len);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}