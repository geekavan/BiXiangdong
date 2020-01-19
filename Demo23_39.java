import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Demo23_39 {
    public static void main(String[] args){
        ArrayList<File> alDirs = new ArrayList<File>();
        ArrayList<File> alFiles = new ArrayList<File>();

        File root = new File("f:\\testDir");
        alDirs.add(root);
        while(!alDirs.isEmpty()){
            File temp = alDirs.remove(0);
            File[] dirs = temp.listFiles(new FileFilter(){
            
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory();
                }
            });
            if(dirs!=null)
                alDirs.addAll(Arrays.asList(dirs));
            File[] files = temp.listFiles(new FileFilter(){
            
                @Override
                public boolean accept(File pathname) {
                    return pathname.isFile();
                }
            });
            if(files!=null)
                alFiles.addAll(Arrays.asList(files));
        }
        Iterator<File> it = alFiles.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}