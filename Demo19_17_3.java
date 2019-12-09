import java.util.Arrays;
import java.util.List;

class Demo19_17_3{
    public static void main(String[] args){

        Integer[] arr2 = {1, 2, 3, 4, 5, 6};
        List<Integer> list2 = Arrays.asList(arr2);
        System.out.println(list2.add(5));
    }
}