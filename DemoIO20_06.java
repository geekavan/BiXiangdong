import java.io.FileReader;
import java.io.IOException;

class DemoIO20_06 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("e:/FileWriter.txt");

        int ch = 0;
        while((ch=fr.read())!=-1)                       
            System.out.print((char)ch);

        fr.close();
    } 
}