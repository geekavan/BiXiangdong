class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
}
class GetClassDemo{
    public static void main(String[] args){
        Person p1 = new Person("张三");
        Person p2 = new Person("李四");
        Class c1 = p1.getClass();//获取了Person.class字节码文件对象
        Class c2 = p2.getClass();
        System.out.println(c1==c2);
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}