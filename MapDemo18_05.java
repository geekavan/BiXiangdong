import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class MapDemo18_05 {
    public static void main(String[] args){
        Map<Integer, String> map  = new  HashMap<Integer, String>();
        
        map.put(1,"zhangyi");
        map.put(5,"wangwu");
        map.put(4,"zhaosi");
        map.put(2,"suner");

        Collection<String> mapValues = map.values();
        Iterator<String> it = mapValues.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}