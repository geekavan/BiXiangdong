import java.io.IOException;
import java.io.InputStream;

class Demo22_24 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        StringBuilder sb = new StringBuilder();

        int ch = 0;

        while((ch = in.read())!=-1){
            String temp = sb.toString();
            if(ch=='\r')
                continue;
            if(ch=='\n'){
                System.out.println(temp.toUpperCase());
                if(temp.equals("over"))
                    break;
                sb.delete(0, sb.length());
            }
            else
                sb.append((char)ch);
        }
    }
}