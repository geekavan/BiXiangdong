import java.io.File;

class Demo22_35 {
    public static void main(String[] args){
        File f = new File("f:\\a.txt");
        f.renameTo(new File("e:\\eee.txt"));
    }
}