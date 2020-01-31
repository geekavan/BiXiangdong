import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Demo24_60 {
    public static void main(String[] args) throws IOException {
        File desFile = new File("f:\\random.txt");
        if(desFile.exists()){
            desFile.delete();
        }
        RandomAccessFile raf = new RandomAccessFile(desFile, "rw");
        raf.write("张三".getBytes());
        raf.write(97);
        raf.writeInt(97);
        
        RandomAccessFile rafr = new RandomAccessFile(desFile, "r");
        rafr.seek(5);
        byte[] buff = new byte[4];
        rafr.read(buff);
        String s = new String(buff);
        System.out.println(s);
    }
}