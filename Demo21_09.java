import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Demo21_09{
    private static final int BUFFER_SIZE = 4096;
    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("e:/FileWriter.txt");
            fw = new FileWriter("f:/就叫这个名字了.txt");

            char[] ch = new char[BUFFER_SIZE];
            int len = 0;

            while((len=fr.read(ch))!=-1){
                fw.write(ch, 0, len);
            }
        }
        catch(IOException e){}
        finally{
            try{if(fr!=null) fr.close();}catch(IOException e){throw new RuntimeException("读取流关闭异常");}
            try{if(fw!=null) fw.close();}catch(IOException e){throw new RuntimeException("写入流关闭异常");}
        }
    }
}