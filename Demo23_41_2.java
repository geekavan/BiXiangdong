import java.io.File;

class Demo23_41_2 {
    public static void main(String[] args){
        File dir = new File("F:\\testDir");
        removeDir(dir);
    }

    private static void removeDir(File dir) {
        File[] files = dir.listFiles();
        for(File file:files){
            if(file.isDirectory())
                removeDir(file);
            else
                file.delete();
        }
        dir.delete();
    }
}