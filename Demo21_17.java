import java.io.FileReader;
import java.io.IOException;

class Demo21_17{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("e:/test.txt");

        MyBufferedReader bufr = new MyBufferedReader(fr);

        String line = null ;
        while((line = bufr.MyReadLine())!=null){
            System.out.println(line);
        }
        bufr.close();
    }
}
class MyBufferedReader{
    private FileReader fr;
    private char[] buffer;
    private static final int BUFFER_SIZE = 2;
    private int pos = 0;
    private int count = 0;
    MyBufferedReader(FileReader fr){
        this.fr = fr;
        this.buffer = new char[BUFFER_SIZE];
    }
    public int myRead() throws IOException{
        if(count==0){
            count = this.fr.read(buffer);
            pos = 0;
        }
        if(count<0)
            return -1;
        char ch = buffer[pos++];
        count--;
        return ch;
    }
    public void close()throws IOException{
        this.fr.close();
        return ;
    }
    public String MyReadLine() throws IOException{
        StringBuilder sb = new StringBuilder();

        int ch = 0;
        while((ch = myRead())!=-1){
            if(ch=='\r')
                continue;
            if(ch=='\n')
                return sb.toString();
            sb.append((char)ch);
        }
        if(sb.length()!=0)
            return sb.toString();
        return null;
    }
}