import java.text.SimpleDateFormat;
import java.util.Date;

class Demo20_05_04 {
    public static void main(String[] args){
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM-+++***&^%$#@!-dd");
        String str_date = sdf.format(date);
        System.out.println(str_date);
    }
}