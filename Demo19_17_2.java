import java.util.Arrays;
import java.util.List;

class Demo19_17_2{
    public static void main(String[] args){
        String[] arr = {"xixi","haha","hiahia"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list.contains("haha"));

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(arr1);
        List<int[]> list1 = Arrays.asList(arr1);
        System.out.println(list1);

        Integer[] arr2 = {1, 2, 3, 4, 5, 6};
        List<Integer> list2 = Arrays.asList(arr2);
        System.out.println(list2);



    }
}