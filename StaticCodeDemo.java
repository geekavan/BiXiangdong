class Person{

    {
        System.out.println("构造代码块 run");
    }
    Person(){
        System.out.println("构造函数 run");
    }
    static{
        System.out.println("静态代码块 run");
    }
    public void show(){
        System.out.println("show run");
        {
            System.out.println("局部代码块 run");
        }
    }
}
class StaticCodeDemo{
    public static void main(String[] args){
        new Person();
        new Person();
        new Person().show();
    }
}