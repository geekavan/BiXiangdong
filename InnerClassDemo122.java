class Outer{
    private static int  num = 4;
    static class Inner{
        public void show(){
            System.out.println("show run ..."+num);
        }
        public static void method(){
            System.out.println("method run ..."+num);
        }
    }
}
class InnerClassDemo122{
    public static void main(String[] args){
        /*由于内部类Inner类是静态的，是随着Outer的加载而进入内存的，
        所以可以直接通过new Outer.Inner();来创建Inner类对象 
        */
        Outer.Inner in = new Outer.Inner();
        in.show();

        /*访问静态内部类静态成员可以直接使用
        外部类.内部类.静态成员 
        格式
        */
        Outer.Inner.method();
    }
}