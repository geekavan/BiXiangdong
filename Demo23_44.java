import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class Demo23_44 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.setProperty("zhangsan", "23");
        prop.setProperty("lisi", "24");
        prop.setProperty("wangwu", "35");
        prop.setProperty("zhaoliu", "46");

        FileOutputStream fos = new FileOutputStream("f:\\info.txt");

        prop.store(fos,"info");

        fos.close();
        
    }
}