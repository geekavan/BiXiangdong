import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo28_10 {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        BufferedReader bufr = new BufferedReader(new FileReader("f:\\1.html"));
        // URL url = new URL("192.168.1.106:8080/1.html");
        // BufferedReader burIn = new BufferedReader(new InputStreamReader(url.openStream(),"uf-8"));
        String regex = "\\w+@\\w+(\\.\\w+)+";
        Pattern p = Pattern.compile(regex);
        String line = null;
        List<String> list = new ArrayList<String>();
        while((line=bufr.readLine())!=null){
            Matcher m = p.matcher(line);
            if(m.find())
                list.add(m.group());
        }
    }
}