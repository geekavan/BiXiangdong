import java.io.FileWriter;
import java.io.IOException;

class DemoIO20_03_2 {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("e:/FileWriter.txt");

        fw.write("str"+LINE_SEPARATOR+"第二行");

        fw.flush();

        fw.close();
    }
}