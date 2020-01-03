import java.io.File;
import java.io.IOException;

class Demo22_33 {
    public static void main(String[] args) throws IOException {
        File f2  = new File("f:\\a\\a.txt\\b.txt");
        f2.mkdirs();
        f2.delete();
    }
}