import java.util.ArrayList;
import java.util.Iterator;

class Demo18_07_2 {
    public static void main(String[] args){
        ArrayList<Person> arr1 = new ArrayList<Person>();
        arr1.add(new Person("张1",11));
        arr1.add(new Person("张2",12));
        arr1.add(new Person("张3",13));
        show(arr1);

        ArrayList<Student> arr2 = new ArrayList<Student>();
        arr2.add(new Student("张4",14));
        arr2.add(new Student("张5",15));
        arr2.add(new Student("张6",16));
        show(arr2);
    }

    public static void show(ArrayList<Person> arr){
        Iterator<Person> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
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