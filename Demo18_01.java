import java.util.ArrayList;
import java.util.Iterator;

class Demo18_01 {
    public static void main(String[] args){
        ArrayList al  = new ArrayList();
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");

        for(Iterator it = al.iterator();it.hasNext();){
            String str = (String)it.next();
            System.out.println(str);
        }

    }
}