class Demo implements Runnable{
    boolean flag = true;
    public synchronized void run(){
        while(flag){
            try{wait();}catch(Exception e){ flag = false;}
        }
        System.out.println(Thread.currentThread().getName()+"run");
    }
}
class Demo14_34{
    public static void main(String[] args){
        Demo d = new Demo();

        Thread t0 = new Thread(d);
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t0.interrupt();
    }
}