import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

class Demo21_20{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("e:/test.txt");

        LineNumberReader lnfr = new LineNumberReader(fr);

        String line = null;
        while((line = lnfr.readLine())!=null){
            System.out.println(lnfr.getLineNumber()+":"+line);
        }
    }
}