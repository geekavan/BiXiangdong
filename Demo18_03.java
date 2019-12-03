import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Demo18_03 {
    public static void main(String[] args){
        Map<Integer, String> map  = new  HashMap<Integer, String>();
        
        map.put(1,"zhangyi");
        map.put(5,"wangwu");
        map.put(4,"zhaosi");
        map.put(2,"suner");

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()){
            Integer id = it.next();
            String name = map.get(id);
            System.out.println(id+"......"+name);
        }


    }
}
