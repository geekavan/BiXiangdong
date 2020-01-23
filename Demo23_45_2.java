import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

class Demo23_45_2 {
    public static void main(String[] args) throws IOException {
        myLoad();
    }

    public static void myLoad() throws IOException {
        Properties prop = new Properties();
        BufferedReader bufr =  new BufferedReader(new FileReader("f:\\info.txt"));

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