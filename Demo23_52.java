import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Demo23_52 {
    private static final int SIZE = 51200;//1024*50*1字节=50k

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\0.jpg");
        splitFile(file);
    }
    public static void splitFile(File file) throws IOException{
        FileInputStream fis = new FileInputStream(file);
        File dir = new File("f:\\");
        int count = 1;        
        FileOutputStream fos = null;

        byte[] buff = new byte[SIZE];

        int len  = 0;
        while((len=fis.read(buff))!=-1){
            fos = new FileOutputStream(new File(dir,(count++)+".haha"));
            fos.write(buff,0,len);
        }
        fos.close();
        fis.close();
    }
}