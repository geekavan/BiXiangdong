import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Demo16_09_2 {
    public static void main(String[] args) {
        List lt = new ArrayList();

        lt.add("abc1");
        lt.add("abc2");
        lt.add("abc3");

        ListIterator it = lt.listIterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj=="abc2")
                it.add("abc9");
            else
                System.out.println("next......"+obj);
        }
        System.out.println(lt);
        }
}