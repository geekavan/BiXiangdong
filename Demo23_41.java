import java.io.File;

class Demo23_41 {
    public static void main(String[] args){
        File dir = new File("f:\\testDir");
        deleteFiles(dir);
    }
    private static void deleteFiles(File dir) {
        File[] files = dir.listFiles();
        for(int i=0;i<files.length;i++){
            File temp = files[i];
            if(temp.isFile()){
                temp.delete();
                System.out.println(temp);
            }
            if(temp.isDirectory())
            deleteFiles(temp);
            if(temp.length()==0)
                temp.delete();
        }
    }
}