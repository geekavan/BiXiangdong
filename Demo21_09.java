import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Demo21_09{
    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("e:/FileWriter.txt");
            fw = new FileWriter("f:/就叫这个名字了.txt");

            char[] ch = new char[4096];

            while(fr.read(ch)!=-1){
                fw.write(ch);
            }
        }
        catch(IOException e){}
        finally{
            try{
            if(fr!=null) fr.close();
            if(fw!=null) fw.close();
            }
            catch(IOException e){}
            finally{}
        }
    }
}