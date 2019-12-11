import java.text.DateFormat;
import java.util.Date;

class Demo20_05 {
    public static void main(String[] args){
        Date date = new Date();

        DateFormat dateFormat = DateFormat.getDateInstance();

        String str_date = dateFormat.format(date);

        System.out.println(str_date);
    }
}