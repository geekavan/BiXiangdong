import java.io.FileReader;
import java.io.IOException;

class Demo21_16_2{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("e:/test.txt");

        MyBufferedReader bufr = new MyBufferedReader(fr);

        int ch = 0 ;
        while((ch = bufr.myRead())!=-1){
            System.out.print((char)ch);
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
}