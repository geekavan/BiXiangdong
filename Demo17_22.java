import java.util.Iterator;
import java.util.TreeSet;


public class Demo17_22 {
    public static void main(final String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Person("张三",13));
        ts.add(new Person("王五",15));
        ts.add(new Person("李四",14));
        ts.add(new Person("李四",14));

        for(Iterator it = ts.iterator();it.hasNext();){
            Person p = (Person)it.next();
            System.out.println(p.getName()+"......"+p.getAge());
        }
        
    }
}
class Person implements Comparable{
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public int compareTo(Object obj){
        if(this==obj)
            return 0;
        if(!(obj instanceof Person))
            throw new ClassCastException();
        Person p  = (Person)obj;
        return this.age - p.age;
    }
}