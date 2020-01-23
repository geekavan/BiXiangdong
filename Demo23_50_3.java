import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

class Demo23_50_3 {
    public static void main(String[] args) throws IOException {

        ArrayList<FileInputStream> v = new ArrayList<FileInputStream>();
        v.add(new FileInputStream("f:\\1.txt"));
        v.add(new FileInputStream("f:\\2.txt"));
        v.add(new FileInputStream("f:\\3.txt"));
        
        Enumeration<FileInputStream> en = Collections.enumeration(v);
        SequenceInputStream sis = new SequenceInputStream(en);

        FileOutputStream fos = new FileOutputStream("f:\\4.txt");

        byte[] buf = new byte[1024];

        int len = 0;

        while((len = sis.read(buf))!=-1){
            fos.write(buf, 0, len);
        }

        fos.close();
        sis.close();
    }
}