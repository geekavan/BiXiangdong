import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

class Demo18_07 {
    public static void main(String[] args){
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("abc1");
        arr1.add("abc2");
        arr1.add("abc3");
        show(arr1);

        LinkedList<String> arr2 = new LinkedList<String>();
        arr2.add("abc4");
        arr2.add("abc5");
        arr2.add("abc6");
        show(arr2);

    }
    public static void show(Collection<String> arr){
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}