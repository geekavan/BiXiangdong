class Demo21_18_19_2{
    public static void main(String[] args){

        Worker w = new Worker();
        NewPerson newP = new NewPerson(w);

        newP.walk();
    }
}
abstract class Person{
    int age;
    String name;
    Person(){}
    Person(String name, int age){this.name = name;this.age = age;}
    abstract void walk();
}
class Worker extends Person{
    Worker(){}
    Worker(String name, int age){
        super(name, age);
    }
    void walk(){
        System.out.println("两条腿走路");
    }
}
class NewPerson extends Person{
    private Person p;
    NewPerson(Person p){
        this.p = p;
    }
    void walk(){
        System.out.println(p.name+"......"+p.age+"......"+"坐地铁");
        p.walk();
    }
}
