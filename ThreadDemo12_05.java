class Demo extends Thread{
    private String name;
    Demo(String name){
        this.name = name;
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("name......"+name+i);
        }
    }
}
class ThreadDemo12_05{
    public static void main(String[] args){
        Demo d1 = new Demo("如花");
        Demo d2 = new Demo("xiaoqiang");
        d1.start();
        d2.start();
        System.out.println("hehehehehehe!");
    }
}