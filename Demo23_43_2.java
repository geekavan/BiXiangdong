import java.util.Properties;

class Demo23_43_2 {
    public static void main(String[] args){
        Properties prop = (System.getProperties());

        prop.list(System.out);
    }
}