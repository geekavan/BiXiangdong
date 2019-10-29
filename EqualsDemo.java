class Person{
    private String name;
    Person(String name){
        this.name = name;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            throw new ClassCastException("类型错误");
        }
        if(this.name == ((Person)obj).name)
            return true;
        return false;
    }
}
class EqualsDemo{
    public static void main(String[] args){
        Person p1 = new Person("张三");
        Person p2 = new Person("张三");
        System.out.println(p1.equals(p2));
    }
}