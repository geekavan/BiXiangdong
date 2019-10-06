class ThisDemo{
    public static void main(String[] args){
        Person p = new Person("如花");
    }
}
class Person{
    String name;
    int age;
    Person(String name){
        this.name = name;
    }
    Person(String name, int age){
        this(name);//必须放在第一行
        this.age = age;
    }
}