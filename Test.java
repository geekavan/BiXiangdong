import java.util.List;
import java.util.ArrayList;
class Test{
    public static void main(String[] args){
        func(new ArrayList<Integer>());
        func(new ArrayList<String>());
    }
    public static int func(List<Integer> list){
        return 1;
    }
    public static String func(List<String> list){
        return "!";
    }
}