class Demo extends Thread{
    Demo(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+"......"+currentThread().getName());
        }
    }
}
class ThreadDemo12_06{
    public static void main(String[] args){
        Demo d1 = new Demo("如花");
        Demo d2 = new Demo("xiaoqiang");
        d1.run();
        d2.run();
        System.out.println("hehehehehehe!");
    }
}