import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Demo19_14 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("cb");
        list.add("bc");
        list.add("nba");
        list.add("dcba");
        list.add("cb");

        Collections.sort(list);

        System.out.println(list);

        int temp = Collections.binarySearch(list, "nba");

        System.out.println(temp);


    }
}