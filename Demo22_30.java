import java.io.FileWriter;
import java.io.IOException;

class Demo22_30 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e:\\a.txt");
        fw.write("热血");
        fw.close();
    }
}