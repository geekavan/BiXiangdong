import java.io.File;

class Demo22_36 {
    public static void main(String[] args){

        File f = new File("e:\\");

        System.out.println("getTotalSpace()......"+f.getTotalSpace());
        System.out.println("getFreeSpace()......"+f.getFreeSpace());
        System.out.println("getUsableSpace()......"+f.getUsableSpace());
    }
}