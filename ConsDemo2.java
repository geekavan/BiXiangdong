class ConsDemo2{
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.name+":"+p.sex+"|");
        Person p1 = new Person('f');
        System.out.println(p1.name+":"+p1.sex+"|");
        Person p2 = new Person("小明",'f');
        System.out.println(p2.name+":"+p2.sex+"|");
    }
}
class Person{
    String name;//为了减少代码量，我没有限定成员变量为private
    char sex;
    Person(){}
    Person(char sex){
        this.sex = sex;
    }
    Person(String name, char sex){
        this.name = name;
        this.sex = sex;
    }
}