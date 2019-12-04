import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Demo19_13_2 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("cb");
        list.add("bc");
        list.add("nba");
        list.add("dcba");
        list.add("cb");

        System.out.println(list);

        MyCollections.mySort(list);

        System.out.println(list);

    }
}
class MyCollections{
    public static  <T extends Comparable<? super T>> void mySort(List<T> list){
        for(int i=0;i<list.size();i++){
            for(int j = i+1; j<list.size();j++){
                if(list.get(i).compareTo(list.get(j))>0)
                    Collections.swap(list, i, j);
            }
        }
    } 
}