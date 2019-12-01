import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Demo18_08_2 {
    public static void main(String[] args){

        TreeSet<Student> arr2 = new TreeSet<Student>(new ComparatorImp());
        arr2.add(new Student("张4",14));
        arr2.add(new Student("张5",15));
        arr2.add(new Student("张4",13));
        show(arr2);
    }

    public static void show(Collection<? extends Person> arr){
        Iterator<? extends Person> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class ComparatorImp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.name.compareTo(o2.name);
        return temp==0?(o1.age-o2.age):temp;
    }
    
}
class Person{
    String name;
    int age;
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+"..."+age;
    }
}
class Student extends Person{
    Student(){}
    Student(String name, int age){
        super(name, age);
    }
}
class Worker extends Person{
    Worker(){}
    Worker(String name, int age){
        super(name, age);
    }
}