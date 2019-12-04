import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Demo19_01 {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"zhaoyi");
        hm.put(7,"liqi");
        hm.put(2,"wanger");
        hm.put(3,"zhangsan");

        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> en = it.next();
            Integer key = en.getKey();
            String value = en.getValue();
            System.out.println(key+"......"+value);
        }
    }
}