import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;

class Demo22_32_2 {
    public static void main(String[] args) throws IOException {
        /*
        1.获取(这里文件指文件或文件夹)
            获取文件名称
            获取文件大小
            获取文件所在路径
            获取文件最后修改日期
        */
        File f = new File("e:\\b.txt");

        String name = f.getName();
        long len = f.length();
        String absPath = f.getAbsolutePath();
        String canPath = f.getCanonicalPath();
        long time = f.lastModified();

        Date date = new Date(time);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String str_time = df.format(date);

        System.out.println("name......"+name);
        System.out.println("len......"+len);
        System.out.println("absPath......"+absPath);
        System.out.println("canPath......"+canPath);
        System.out.println("time......"+time);
        System.out.println("str_time......"+str_time);
    }
}