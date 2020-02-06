import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Demo28_08_3 {
    public static void main(String[] args){
        String str = "192.168.1.106  92.168.113.0 3.3.3.3 255.255.255.0";
        String regex = " +";
        String[] ips = str.split(regex);
        TreeSet<String> hm = new TreeSet<String>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                String regex = "\\d+";
                String replacement = "00$0";
                o1 = o1.replaceAll(regex, replacement);
                o2 = o2.replaceAll(regex, replacement);
                regex = "0*(\\d{3})";
                replacement = "$1";
                o1 = o1.replaceAll(regex, replacement);
                o2 = o2.replaceAll(regex, replacement);
                return o1.compareTo(o2);
            }
        });
        for(String ip:ips){
            hm.add(ip);
        }
        Iterator<String> it = hm.iterator();
        while(it.hasNext()){
            System.out.println(it.next().replaceAll("0*(\\d+)", "$1"));
        }
    }
}