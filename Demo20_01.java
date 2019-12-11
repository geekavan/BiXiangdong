import java.util.Properties;
import java.util.Set;

class Demo20_01{
    public static void main(String[] args){

        Properties prop = System.getProperties();

        Set<String> nameSet = prop.stringPropertyNames();

        for(String name:nameSet){
            String value = prop.getProperty(name);
            System.out.println(name+"......"+value);
        }
    }
}