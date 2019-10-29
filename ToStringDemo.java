class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
}
class ToStringDemo{
    public static void main(String[] args){
        Person p = new Person("张三");
        System.out.println(p);
        System.out.println(p.toString());
        System.out.println(p.getClass().getName()+"$"+Integer.toHexString(p.hashCode()));
    }
}