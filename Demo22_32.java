import java.io.File;
import java.io.IOException;

class Demo22_32 {
    public static void main(String[] args) throws IOException {
        /*
        1.获取(这里文件指文件或文件夹)
            获取文件名称
            获取文件大小
            获取文件所在路径
            获取文件最后修改日期
        */
        File f = new File("e:\\a.txt");

        String name = f.getName();
        long len = f.length();
        String absPath = f.getAbsolutePath();
        String canPath = f.getCanonicalPath();
        long time = f.lastModified();

        System.out.println("name......"+name);
        System.out.println("len......"+len);
        System.out.println("absPath......"+absPath);
        System.out.println("canPath......"+canPath);
        System.out.println("time......"+time);
    }
}