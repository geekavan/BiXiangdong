interface Demo{
    public abstract void show();
}
class Outer{
    class Inner{
        public void show(){
        }
    }
    public void method(){
        Inner in = new Inner();
        in.show();
    }
}
class InnerClassDemo15{
    public static void main(String[] args){
        new Outer().method();
    }
}