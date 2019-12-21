import java.io.FileReader;
import java.io.IOException;

class DemoIO20_07 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("e:/FileWriter.txt");

        char[] ch = new char[3];
        int num = 0;

        while((num = fr.read(ch))!=-1){
            System.out.print(new String(ch, 0, num));
        }
        
        fr.close();
    }
}