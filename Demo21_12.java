import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Demo21_12{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("e:/test.txt");

        BufferedWriter bufw = new BufferedWriter(fw);

        for(int i=1;i<5;i++){
            bufw.write("abcde"+i);
            bufw.newLine();
            bufw.flush();
        }

        bufw.close();
    }
}