import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;

class Demo23_54 {
    public static void main(String[] args) throws IOException {
        File file = new File("f:\\0.jpg");
        File desDir = new File("f:\\test");
        int size = 40;
        SplitAndMerge.merge(new File("f:\\test\\"));
    }
}

class SplitAndMerge {
    public static void split(File file, File desDir, int size) throws IOException {
        if (!desDir.exists()) {
            desDir.mkdirs();
        }
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = null;
        byte[] buff = new byte[1024 * size];
        int len = 0;
        int count = 1;
        while ((len = fis.read(buff)) != -1) {
            fos = new FileOutputStream(new File(desDir, (count++) + ".part"));
            fos.write(buff, 0, len);
            fos.close();
        }
        Properties prop = new Properties();
        prop.setProperty("count", count + "");
        prop.setProperty("filename", file.getName());
        fos = new FileOutputStream(new File(desDir, count + ".properties"));
        prop.store(fos, "");
        fos.close();
        fis.close();
    }

    public static void merge(File propDir) throws IOException {
        File[] propFiles = propDir.listFiles(new FilenameFilterByProp());
        if(propFiles.length!=1){
            throw new RuntimeException("配置文件不存在或不唯一！");
        }
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(propFiles[0]);
        prop.load(fis);
        int count = Integer.parseInt(prop.getProperty("count"));
        String filename = prop.getProperty("filename");
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for(int i=1;i<count;i++){
            al.add(new FileInputStream(new File(propDir, i+".part")));
        }
        SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(al));
        FileOutputStream fos = new FileOutputStream(new File(propDir, filename));
        byte[] buff = new byte[1024];
        int len = 0;
        while((len=sis.read(buff))!=-1){
            fos.write(buff, 0, len);
        }
        fos.close();
        sis.close();
    }
}

class FilenameFilterByProp implements FilenameFilter{
    String suffix = ".properties";
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }

}