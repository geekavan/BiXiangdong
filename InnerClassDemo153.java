interface Demo{
    public abstract void show();
}
class Outer{
    public void method(){
        Demo d = new Demo(){
            public void show(){}
            public void function(){}
        };
        d.show();
        d.function();
    }
}
class InnerClassDemo153{
    public static void main(String[] args){
        new Outer().method();
    }
}