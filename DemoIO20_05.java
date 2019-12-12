import java.io.FileWriter;
import java.io.IOException;

class DemoIO20_04 {
    public static void main(String[] args){
        
        FileWriter fw = null;
        try {
            fw = new FileWriter("e:/FileWriter.txt", true);
            fw.write("续写内容");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(fw!=null)
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}