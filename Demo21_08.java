import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Demo21_08{
    public static void main(String[] args) throws IOException{
        /**
         * 思路：
         * 1.打开读文件流
         * 2.打开写文件流
         * 3.频繁读取文件
         * 4.关闭流
         */
        FileReader fr = new FileReader("e:/FileWriter.txt");
        FileWriter fw = new FileWriter("f:/随便起的名字.txt");
        int ch = 0;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}