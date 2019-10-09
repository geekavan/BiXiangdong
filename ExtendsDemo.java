class ExtendsDemo{
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}
class Fu{
    //静态代码块
    static{
        System.out.println("父类静态代码块  run");
    }
    //构造函数
    Fu(){
        System.out.println("父类构造函数  run");
    }
    //构造代码块
    {
        System.out.println("父类构造代码块  run");
    }
    String str = "fuStr";
}
class Zi extends Fu{
    //静态代码块
    static{
        System.out.println("子类静态代码块  run");
    }
    //构造函数
    Zi(){
        System.out.println("—————————————————————————————————");
        System.out.println(this.str);
        this.str = "子类构造函数  run";
        System.out.println(this.str);
        System.out.println("—————————————————————————————————");
    }
    //构造代码块
    {
        System.out.println("—————————————————————————————————");
        System.out.println(this.str);
        this.str = "子类构造代码块  run";
        System.out.println(this.str);
        System.out.println("—————————————————————————————————");
    }
    String str = "ziStr";
    public void show(){
        System.out.println("—————————————————————————————————");
        System.out.println("show run");
        System.out.println(this.str+"......"+super.str);
        System.out.println("—————————————————————————————————");
    }
}