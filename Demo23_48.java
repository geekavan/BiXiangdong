import java.io.IOException;
import java.io.PrintStream;

class Demo23_48 {
    public static void main(String[] args) throws IOException {
        PrintStream pw = new PrintStream("f:\\test.txt");
        pw.write(609);
        pw.write(97);
        pw.print(97);
    }
}