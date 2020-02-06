import java.util.Iterator;
import java.util.TreeSet;

class Demo28_08_2 {
    public static void main(String[] args){
        String str = "192.168.1.106  92.168.113.0 3.3.3.3 255.255.255.0";
        str = str.replaceAll("\\d+","00$0");
        str = str.replaceAll("0*(\\d{3})","$1");
        String regex = " +";
        String[] ips = str.split(regex);
        TreeSet<String> hm = new TreeSet<String>();
        for(String ip:ips){
            hm.add(ip);
        }
        Iterator<String> it = hm.iterator();
        while(it.hasNext()){
            System.out.println(it.next().replaceAll("0*(\\d+)", "$1"));
        }
    }
}