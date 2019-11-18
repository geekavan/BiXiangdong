class Demo implements Runnable{
    public void run(){
        for(int i = 0;i<5;i++)
            System.out.println(Thread.currentThread().toString()+"......."+i);
    }
}
class Demo14_36{
    public static void main(String[] args) throws Exception{
        Demo d = new Demo();
        Thread t0 = new Thread(d);
        Thread t1 = new Thread(d);

        t0.start();
        t0.join();
        t1.start();

        for(int i=0;i<5;i++){
            System.out.println("main"+i);
        }
    }
}