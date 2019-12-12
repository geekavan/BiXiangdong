import java.util.Calendar;

class Demo20_08{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}