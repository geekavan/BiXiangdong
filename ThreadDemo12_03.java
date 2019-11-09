class Demo{
    public void finalize(){
        System.out.println("finalize run!");
    }
}
class ThreadDemo12_03{
    public static void main(String[] args){
        new Demo();
        new Demo();
        new Demo();
        System.gc();
        System.out.println("hello world !");
    }
}