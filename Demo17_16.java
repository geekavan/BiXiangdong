import java.util.HashSet;

public class Demo17_16{
    public static void main(final String[] args) {
        final HashSet hs = new HashSet();
        hs.add(new Person("张三",13));
        hs.add(new Person("李四",14));
        hs.add(new Person("李四",14));
        hs.add(new Person("王五",15));
    }
}
class Person{
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public int hashCode(){
        System.out.println("hashCode()......run!");
        return this.name.hashCode()+this.age;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(!(obj instanceof Person))
            throw new ClassCastException("类型转换异常");
        System.out.println("equals()......run!");
        Person p  = (Person)obj;
        return this.name.equals(p.getName()) && this.age==p.getAge();
    }

}