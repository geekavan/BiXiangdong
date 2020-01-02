import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

class Demo22_25_3 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bufr = new BufferedReader(isr);

        PrintStream out = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter bufw = new BufferedWriter(osw);

        String line = null;
        while((line = bufr.readLine())!=null){
            if("over".equals(line))
                break;
            bufw.write((line.toUpperCase()));
            bufw.newLine();
            bufw.flush();
        }
    }
}