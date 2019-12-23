import java.io.FileInputStream;
import java.io.IOException;

class Demo21_21_2{
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("e://fostest.txt");

        //方式一
        //一次读入一个字节
        // int ch = 0;
        // while((ch=fis.read())!=-1){
        //     System.out.print((char)ch);
        // }

        // 方式二
        //利用byte类型的数组
        // byte[] b = new byte[1024];
        // int len = 0;
        // while((len = fis.read(b))!=-1){
        //     System.out.println(new String(b, 0, len));
        // }

        //方式三
        //使用byte类型的数组
        // byte[] b = new byte[fis.available()];
        // fis.read(b);
        // System.out.println(new String(b));
    }
}