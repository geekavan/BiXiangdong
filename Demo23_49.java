import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Demo23_49 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        PrintWriter pw = new PrintWriter(System.out);

        String line = null;

        while((line=bufr.readLine())!=null){
            if("over".equals(line))
                break;
            pw.println(line.toUpperCase());
            pw.flush();
        }

        pw.close();
        bufr.close();
    }
}