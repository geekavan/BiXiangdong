import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class Demo17_22_2{
    public static void main(String[] args){
        TreeSet ts = new TreeSet( new ComparatorImp());
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

class Person{
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
}

class ComparatorImp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.getAge()-p2.getAge();
    }
}