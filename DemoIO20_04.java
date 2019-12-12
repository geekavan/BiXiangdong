import java.io.FileWriter;
import java.io.IOException;

class DemoIO20_04 {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("e:/FileWriter.txt",true);

        fw.write("续写内容");

        fw.close();
    }
}