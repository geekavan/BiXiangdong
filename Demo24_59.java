import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Demo24_59 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rsf = new RandomAccessFile(new File("f:\\random.txt"), "rw");
        rsf.write("zhangsan".getBytes());
        rsf.write(97);
        rsf.write(609);
        rsf.writeInt(609);
        rsf.close();
    }
}