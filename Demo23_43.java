import java.util.Properties;
import java.util.Set;

class Demo23_43 {
    public static void main(String[] args){
        Properties prop = new Properties();

        prop.setProperty("zhangsan", "21");
        prop.setProperty("lisi", "22");
        prop.setProperty("wangwu", "25");
        prop.setProperty("zhaoliu", "36");

        //System.out就是PrintStream的类型
        prop.list(System.out);

    }
}