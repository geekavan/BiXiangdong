class Resource{
    private String name;
    private int count=0;
    boolean flag=false;
    public synchronized void set(String name){
        //如果标志位为真，意味着已经生产好商品，生产线程可以等待了
        while(flag)
            //持有此对象监视器的线程进入此对象监视器的等待集(此对象监视器的线程池)中，释放锁
            try{this.wait();}catch(InterruptedException e){}
        this.name = name;
        this.count++;
        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name+this.count);
        flag = true;
        //唤醒此对象监视器的等待集中的一个线程，至于是哪个线程是随机的
        this.notify();
    }
    public synchronized void out(){
        while(!flag)
            try{this.wait();}catch(InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+".....................消费者..."+this.name+this.count);
        flag = false;
        this.notify();
    }
}
class Producer implements Runnable{
    Resource r;
    Producer(Resource r){
        this.r = r;
    }
    public void run(){
        while(true)
            r.set("烤鸭");
    }
}
class Consumer implements Runnable{
    Resource r;
    Consumer(Resource r){
        this.r = r;
    }
    public void run(){
        while(true)
            r.out();
    }
}
class Demo14_26_3{
    public static void main(String[] args){
        Resource r = new Resource();

        Producer p0 = new Producer(r);
        Producer p1 = new Producer(r);
        Consumer c0 = new Consumer(r);
        Consumer c1 = new Consumer(r);

        Thread t0 = new Thread(p0);
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c0);
        Thread t3 = new Thread(c1);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}