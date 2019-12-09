import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Demo19_15 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("cb");
        list.add("bc");
        list.add("nba");
        list.add("dcba");
        list.add("cb");

        
        Collections.sort(list, new ComparatorImpl());

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder(new ComparatorImpl()));

        System.out.println(list);


    }
}
class ComparatorImpl implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int temp = o1.length()-o2.length();
        return temp==0?o1.compareTo(o2):temp;
    }
    
}