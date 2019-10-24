interface Demo{
    public abstract void show();
}
class Outer{
    //匿名内部类形势下就没有内部类了
    // class Inner{
    //     public void show(){
    //     }
    // }
    public void method(){
        new Demo(){
            public void show(){}
        };
    }
}
class InnerClassDemo152{
    public static void main(String[] args){
        new Outer().method();
    }
}