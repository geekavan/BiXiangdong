import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

class MapDemo18_08_2 {
    public static void main(String[] args){
        Map<Person, String> map = new TreeMap<Person, String>(new ComparatorImpl());

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
class ComparatorImpl implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(!(o1 instanceof Person) || !(o2 instanceof Person))
            throw new RuntimeException("");
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        int temp = p1.name.compareTo(p2.name);
        return temp==0?(p1.age-p2.age):temp;
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