import java.util.Date;

class Demo20_04 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);

        Date date2 = new Date(1576050226835l);
        System.out.println(date2);
        
        System.out.println(date2.getTime());

    }
}