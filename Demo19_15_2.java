import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Demo19_15_2{
    public static void main(String[] args){
        Set<String> s = new TreeSet<String>(Collections.reverseOrder());

        s.add("abc");
        s.add("cba");
        s.add("bac");
        s.add("zac");
        s.add("nac");

        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}