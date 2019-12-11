import java.io.IOException;

class Demo20_02 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}