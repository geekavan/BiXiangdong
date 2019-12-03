import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class MapDemo18_04 {
    public static void main(String[] args0){
        Map<Integer, String> map  = new  HashMap<Integer, String>();
        
        map.put(1,"zhangyi");
        map.put(5,"wangwu");
        map.put(4,"zhaosi");
        map.put(2,"suner");

        Set<Map.Entry<Integer,String>> keySet = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = keySet.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> me = it.next();
            Integer id = me.getKey();
            String name = me.getValue();
            System.out.println(id+"......"+name);
        }
    }
}