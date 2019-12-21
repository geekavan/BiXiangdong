import java.io.FileReader;
import java.io.IOException;

class DemoIO20_07_2{
    public static void main(String[] args){
        FileReader fr = null;

        try {
            fr = new FileReader("f:/abc.txt");
            char[] ch = new char[3];
            int len = 0;
            while((len = fr.read(ch))!=-1){
                System.out.println(len);
                System.out.println(ch);
            }
        } catch (Exception e) {
            throw new RuntimeException("读取失败！");
        }
        finally{
            try{
            fr.close();
            }
            catch(IOException e){throw new RuntimeException("关闭异常！");}
        }
    }
}