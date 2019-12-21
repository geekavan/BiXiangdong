import java.text.DateFormat;
import java.util.Date;

class DemoWeek{
    public static void main(String[] args)  throws Exception{
        DateFormat df = DateFormat.getDateInstance();

        Date start = df.parse("2019-12-3");
        Date end = df.parse("2020-2-25");

        long st = start.getTime();
        long en = end.getTime();

        long time = en-st;
        System.out.println(time/(double)1000/60/60/24/7);
    }
}