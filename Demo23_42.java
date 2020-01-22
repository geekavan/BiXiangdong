import java.util.Properties;
import java.util.Set;

class Demo23_42 {
    public static void main(String[] args){
        Properties prop = new Properties();

        prop.setProperty("zhangsan", "21");
        prop.setProperty("lisi", "22");
        prop.setProperty("wangwu", "25");
        prop.setProperty("zhaoliu", "36");

        Set<String> names = prop.stringPropertyNames();

        //修改
        prop.setProperty("zhaoliu", "0");

        for(String name:names){
            String age = prop.getProperty(name);
            System.out.println(name+"......"+age);
        }

    }
}