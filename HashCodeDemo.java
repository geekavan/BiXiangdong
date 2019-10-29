class Person{
    private int age;
    Person(int age){
        this.age = age;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person))
            throw new ClassCastException("类型错误");
        if(this.age==((Person)obj).age)
            return true;
        return false;
    }
}
class HashCodeDemo{
    public static void main(String[] args){
        Person p1 = new Person(20);
        Person p2 = new Person(20);
        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(Integer.toHexString(p1.hashCode()));
    }
}