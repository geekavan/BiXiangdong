import java.io.File;

class Demo22_37 {
    public static void main(String[] args){

        File f = new File("f:\\");

        String[] names = f.list();

        for(String name:names){
            System.out.println(name);
        }
    }
}