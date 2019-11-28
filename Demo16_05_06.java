import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Demo16_05_06 {
    public static void main(String[] args){
        Collection coll = new ArrayList();
        
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");

        for(Iterator it = coll.iterator();it.hasNext();)
            System.out.println(it.next());

        Iterator it = coll.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}