import java.io.FileReader;
import java.io.IOException;

class Demo21_16{
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
    private static final int BUFFER_SIZE = 3;
    private int index = 0;
    private int endIndex = -2;
    MyBufferedReader(FileReader fr){
        this.fr = fr;
        this.buffer = new char[BUFFER_SIZE];
    }
    public int myRead() throws IOException{
        if(endIndex==-2)
            endIndex = this.fr.read(buffer);
        if(index==BUFFER_SIZE){
            endIndex = this.fr.read(buffer);
            this.index = 0;
        }
        if(this.index<this.endIndex){
            return buffer[this.index++];
        }
        return -1;
    }
    public void close()throws IOException{
        this.fr.close();
        return ;
    }
}