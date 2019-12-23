class Demo21_18_19{
    public static void main(String[] args){
        NewWorker newW = new NewWorker();

        newW.walk();
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
class NewWorker extends Worker{
    void walk(){
        System.out.println(this.name+"......"+this.age+"......."+"坐地铁");
        super.walk();
    }
}
