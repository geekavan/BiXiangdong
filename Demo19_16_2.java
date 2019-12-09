import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Demo19_16_2 {
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

        Collections.shuffle(list);

        System.out.println(list);

    }
}