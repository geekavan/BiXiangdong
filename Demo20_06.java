import java.text.DateFormat;
import java.util.Date;

class Demo20_06{
    public static void main(String[] args) throws Exception{

        // DateFormat dateFormat = DateFormat.getDateInstance();
        // String str_date = "2019-9-11";

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        String str_date = "2019年9月11日";

        Date date = dateFormat.parse(str_date);
        System.out.println(date);
    }
}