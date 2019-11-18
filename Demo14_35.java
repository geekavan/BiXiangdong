class Demo implements Runnable{
    boolean flag = false;
    public synchronized void run(){
        if(flag){
            try{wait();}catch(Exception e){}
        }
        System.out.println(Thread.currentThread().getName()+"run");
        flag = true;
    }
}
class Demo14_35{
    public static void main(String[] args){
        Demo d = new Demo();

        Thread t0 = new Thread(d);
        Thread t1 = new Thread(d);

        t0.start();
        t1.setDaemon(true);
        t1.start();
    }
}