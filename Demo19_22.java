import java.util.ArrayList;
import static java.util.Collections.*;
import java.util.List;

class Demo19_22 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(7);

        System.out.println(list);
        
        sort(list);
        
        System.out.println(list);

        Integer max = max(list);

        System.out.println(max);
    }
}