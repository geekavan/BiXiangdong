import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

class Demo23_45_4 {
    public static void main(String[] args) throws IOException {
        File file = new File("f:\\info.txt");
        if(!file.exists()){
            //因为如果文件不存在的话，FileReader就会抛出异常，为了防止其抛出文件未发现异常，我们这里加入了判断机制，如果文件不存在我们就建立一个
            file.createNewFile();
        }
        Properties prop = new Properties();
        FileReader fr = new FileReader(file);
        prop.load(fr);
        prop.setProperty("zhangsan", "98");
        FileWriter fw = new FileWriter("f:\\info.txt");
        prop.store(fw,"");
        fw.close();
        fr.close();
    }
}