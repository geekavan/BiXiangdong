class PersonDemo{
    public static void main(String[] args){
        Person p = new Person();
        p.setAge(-20);
        System.out.println(p.getAge());
    }
}
class Person{
    private int age;
    public void setAge(int ag){
        if(ag<=0 || age>=150)
            System.out.println("错误的数据");
        else
            age = ag;
    }
    public int getAge(){
        return age;
    }
}