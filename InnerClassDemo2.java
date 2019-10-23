class Outer{
    private int num = 3;
    class Inner{
        void show(){
            System.out.println("num......"+num);//内部类可以直接访问外部类的成员
        }
    }
    public void method(){
        Inner in = new Inner();//外部类若想访问内部类的成员，需要建立内部类对象
        in.show();
    }
}
class InnerClassDemo2{
    public static void main(String[] args){
    }
}