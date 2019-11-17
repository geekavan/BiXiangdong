class Resource{
    private String name;
    private int count=1;
    boolean flag=false;
    public synchronized void set(String name){
        //如果标志位为真，意味着已经生产好商品，生产线程可以等待了
        if(flag)
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
        if(!flag)
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
class Demo14_26{
    public static void main(String[] args){
        Resource r = new Resource();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);

        Thread t0 = new Thread(p);
        Thread t1 = new Thread(c);

        t0.start();
        t1.start();
    }
}