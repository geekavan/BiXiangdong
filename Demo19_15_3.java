import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Demo19_15_3 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("cb");
        list.add("bc");
        list.add("nba");
        list.add("dcba");
        list.add("nba");
        list.add("cb");

        System.out.println(list);

        Collections.replaceAll(list, "nba","xixi");//原理list.set(list.indexOf("nba"),"xixi")

        System.out.println(list);


    }
}