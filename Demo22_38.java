import java.io.File;
import java.io.FilenameFilter;

class FilterByTxt implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}

class Demo22_38 {
    public static void main(String[] args){

        File f = new File("f:\\");

        String[] names = f.list(new FilterByTxt());

        for(String name:names){
            System.out.println(name);
        }
    }
}