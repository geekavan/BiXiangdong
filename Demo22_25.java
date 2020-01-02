import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Demo22_25 {
    public static void main(String[] args) throws IOException {
        // 键盘输入的字节流
        InputStream in = System.in;

        //将字节流转换为字符流
        InputStreamReader isr = new InputStreamReader(in);

        //将字符流进行高效装饰
        BufferedReader bufr = new BufferedReader(isr);

        String line = null;

        while((line = bufr.readLine())!=null){
            if("over".equals(line))
                break;
            System.out.println(line.toUpperCase());
        }
    }
}