import java.text.DateFormat;

class Demo20_05_03 {
    public static void main(String[] args){
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        Class<?> c = dateFormat.getClass();
        System.out.println(c.getName());
    }
}