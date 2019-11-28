import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Demo17_01{
    public static void main(String[] args){
        Vector v = new Vector();
        v.addElement("abc1");
        v.addElement("abc2");
        v.addElement("abc3");

        Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        Iterator it = v.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}