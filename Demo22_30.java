import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Demo22_30 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\a.txt"),"utf-8");
        osw.write("你好");
        osw.close();

        InputStreamReader osr = new InputStreamReader(new FileInputStream("e:\\a.txt"));
        BufferedReader bufr = new BufferedReader(osr);
        System.out.println(bufr.readLine());
        bufr.close();

    }
}