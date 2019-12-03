import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

class MapDemo18_08 {
    public static void main(String[] args){
        Map<Person, String> map = new TreeMap<Person, String>();

        map.put(new Person("bca",11), "北京");
        map.put(new Person("abc",14), "上海");
        map.put(new Person("cba",16), "大连");
        map.put(new Person("cba",16), "黑龙江");
        map.put(new Person("zhangsan",13), "成都");

        Iterator<Person> it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Person implements Comparable{
    String name;
    int age;
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode()+this.age*39;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(!(obj instanceof Person))
            throw new RuntimeException("");
        Person p = (Person)obj;
        boolean temp = this.name.equals(p.name);
        return temp?(this.age==p.age):temp;
    }
    @Override
    public String toString(){
        return (this.name+"......"+this.age);
    }
    public int compareTo(Object obj){
        if(this==obj)
            return 0;
        if(!(obj instanceof Person))
            throw new RuntimeException("");
        Person p = (Person)obj;
        return (this.age-p.age);
        // int temp = this.name.compareTo(p.name);
        // return temp==0?(this.age-p.age):temp;
    }
}