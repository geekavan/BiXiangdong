import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

class Demo18_07_3 {
    public static void main(String[] args){
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("abc1");
        arr1.add("abc2");
        arr1.add("abc3");
        show(arr1);

        LinkedList<Integer> arr2 = new LinkedList<Integer>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        show(arr2);

    }
    public static void show(Collection<?> arr){
        Iterator<?> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}