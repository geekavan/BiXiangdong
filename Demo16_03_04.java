import java.util.ArrayList;
import java.util.Collection;

class Demo16_03_04{
    public static void main(String[] args){
        Collection co1 = new ArrayList();
        Collection co2 = new ArrayList();

        co1.add("abc1");
        co1.add("abc2");
        co1.add("abc3");

        co2.add("abc1");
        co2.add("abc3");
        co2.add("abc5");
        co2.add("abc7");

        // co1.addAll(co2);
        //[abc1, abc2, abc3, abc1, abc3, abc5, abc7]

        // co1.removeAll(co2);
        //[abc2]

        // co1.retainAll(co2);
        //[abc1, abc3]

        System.out.println(co1);
    }
}