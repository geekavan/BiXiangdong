import java.io.File;

class Demo23_39_2 {
    public static void main(String[] args) {
        File dirs = new File("f:\\testDir");
        filterFiles(dirs);
    }

    private static void filterFiles(File dirs) {
        File[] files = dirs.listFiles();
        for(int i=0;i<files.length;i++){
            File temp = files[i];
            if(temp.isDirectory())
                filterFiles(temp);
            else if(temp.getName().endsWith(".txt"))
                System.out.println(temp);
        }
    }
}