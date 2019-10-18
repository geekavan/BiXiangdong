interface A{
    public abstract void showA();
}
interface B{
    public abstract void showB();
}
interface C extends A,B{
    public abstract void showC();
}
class Demo implements A,B{
    public void showA()
    {}
    public void showB()
    {}
}