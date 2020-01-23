import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Demo23_45 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        File file = new File("f:\\info.txt");
        FileInputStream fis = new FileInputStream(file);       
        prop.load(fis);
        prop.list(System.out);
    }
}