import java.util.HashMap;
import java.util.Map;

class Demo19_20_2 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("zhangsan", 3);
        map.put("wangwu", 5);
        map.put("lisi", 4);

        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"....."+value);
        }

        for(Map.Entry<String, Integer> me:map.entrySet()){
            String key = me.getKey();
            Integer value = me.getValue();
            System.out.println(key+"........."+value);
        }
    }
}