import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

class Demo23_45_3 {
    public static void main(String[] args) throws IOException {
        myLoad();
    }

    public static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("f:\\info.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufr =  new BufferedReader(isr);

        
        String line = null;
        while((line=bufr.readLine())!=null){
            if(line.startsWith("#"))
                continue;
            String[] temp = line.split("=");
            prop.setProperty(temp[0], temp[1]);
        }
        prop.list(System.out);
    }
}