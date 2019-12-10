import java.util.ArrayList;
import java.util.List;

class Demo19_20 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        for(int i:arr){
            System.out.println(i);
        }

        String[] arr1 = {"xixi", "haha", "hiahia"};
        for(String s:arr1){
            System.out.println(s);
        }

        List<String> list = new ArrayList<String>();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

        for(String s:list){
            System.out.println(s);
        }
    }
}