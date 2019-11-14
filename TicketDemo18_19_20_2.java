class Window implements Runnable{
    private int  TicketNum = 100;
    public boolean flag = true;
    public void run(){
        if(flag)
            while(true)
                synSell();
        else{
            while(true){
                synchronized(this){
                    if(TicketNum>0){
                        try{Thread.sleep(10);}catch(InterruptedException e){}
                        System.out.println(Thread.currentThread().getName()+"......"+TicketNum--);
                    }
                }
            }
        }
    }
    public synchronized void synSell(){
            if(TicketNum>0){
                try{Thread.sleep(10);}catch(InterruptedException e){}
                System.out.println(Thread.currentThread().getName()+"...sell..."+TicketNum--);

            }
    }
}
class TicketDemo18_19_20_2{
    public static void main(String[] args){
        Window w0 = new Window();
        Thread t0 = new Thread(w0);
        Thread t1 = new Thread(w0);
        t0.start();
        try{Thread.sleep(20);}catch(InterruptedException e){}
        w0.flag = false;
        t1.start();
    }
}