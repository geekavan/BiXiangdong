import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Demo19_19 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("haha");
        list.add("xixi");
        list.add("hiahia");
        list.add("heihei");

        String[] arr = list.toArray(new String[3]);
        System.out.println(Arrays.toString(arr));
        
    }
}