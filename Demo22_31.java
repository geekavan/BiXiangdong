import java.io.File;

class Demo22_31 {
    public static void main(String[] args){
        File f1  = new File("e:\\a\\b\\a.txt");
        File f2 =new File("e:\\h","c");
        File f  = new File("e:\\a\\b");
        File f3  = new File(f,"\\c\\a.txt");

        System.out.println("f1......"+f1);
        System.out.println("f2......"+f2);
        System.out.println("f3......"+f3);
        
    }
}