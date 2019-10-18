interface Demo{
    public static final int NUM = 4;
    public abstract void show1();
    public abstract void show2();
}
    
class DemoImpl implements Demo{
    public void show1()
    {}
    public void show2()
    {}
}
class InterfaceDemo{
    public static void main(String[] args){
        DemoImpl d = new DemoImpl();
        System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo.NUM);
    }
}