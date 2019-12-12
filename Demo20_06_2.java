import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Demo20_06_2{
    public static void main(String[] args) throws Exception{


        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM**dd啦啦");
        String str_date = "2019年9**11啦啦";

        Date date = dateFormat.parse(str_date);
        System.out.println(date);
    }
}