import java.io.FileWriter;
import java.io.IOException;

class DemoIO20_03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e:/FileWriter.txt");

        fw.write("str");

        fw.flush();

        fw.close();
    }
}