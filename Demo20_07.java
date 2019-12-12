import java.text.DateFormat;
import java.util.Date;

class Demo20_07{
    public static void main(String[] args) throws Exception{
        
        DateFormat df = DateFormat.getDateInstance();

        Date startDate = df.parse("2012-3-17");
        Date endDate = df.parse("2012-4-6");

        long startMillis = startDate.getTime();
        long endMillis = endDate.getTime();
        long result = endMillis - startMillis;
        System.out.print(result/1000/60/60/24);
    }
}