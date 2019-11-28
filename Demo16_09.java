import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Demo16_09 {
    public static void main(String[] args) {
        List lt = new ArrayList();

        lt.add("abc1");
        lt.add("abc2");
        lt.add("abc3");

        Iterator it = lt.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj=="abc2")
                lt.add("abc9");
            else
                System.out.println("next......"+obj);
        }
        System.out.println(it);
        }
}