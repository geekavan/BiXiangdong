import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Demo21_13{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("e:/test.txt");

        BufferedReader bufr = new BufferedReader(fr);

        String line = null;

        while((line = bufr.readLine())!=null){
            System.out.println(line);
        }

        bufr.close();
    }
}