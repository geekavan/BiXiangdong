class Demo implements Runnable{
    private boolean flag;
    Demo(boolean flag){this.flag = flag;}
    public void run(){
        if(flag){
            while(true)
                synchronized(Lock.locka){
                    System.out.println(Thread.currentThread().getName()+"...if...locka");
                    synchronized(Lock.lockb){
                        System.out.println(Thread.currentThread().getName()+"...if...lockb");
                    }
                }
        }
        else{
            while(true)
            synchronized(Lock.lockb){
                System.out.println(Thread.currentThread().getName()+"...else...lockb");
                synchronized(Lock.locka){
                    System.out.println(Thread.currentThread().getName()+"...else...locka");
                }
            }
        }
    }
}
class Lock{
    public static Object locka = new Object(); 
    public static Object lockb = new Object(); 
}
class DeadLockDemo{
    public static void main(String[] args){
        Demo d1 = new Demo(true);
        Demo d2 = new Demo(false);
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}