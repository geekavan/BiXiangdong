import java.io.IOException;

class Demo20_02_02 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("notepad.exe");
            try{Thread.sleep(5000);}catch(Exception e){}
            p.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}