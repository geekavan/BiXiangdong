import java.io.File;

class Demo22_34 {
    public static void main(String[] args){
        File f = new File("E:\\b.txt");

        f.mkdir();
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}