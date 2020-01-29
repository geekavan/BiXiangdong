import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

class Demo23_53 {
    public static void main(String[] args) throws IOException {
        File dir = new File("f:\\");
        mergeFile(dir);
    }

    private static void mergeFile(File dir) throws IOException {
        ArrayList<FileInputStream> files = new ArrayList<FileInputStream>();
        for(int i = 1;i<4;i++){
            files.add(new FileInputStream(new File(dir, i+".haha")));
        }
        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(files));
        FileOutputStream fos = new FileOutputStream("F:\\mergeFile.jpg");

        byte[] buff = new byte[1024];
        
        int len = 0;
        while((len=sis.read(buff))!=-1){
            fos.write(buff,0,len);
        }
        fos.close();
        sis.close();  
    }
}