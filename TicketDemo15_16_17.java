class Demo{}
class Window implements Runnable{
    private int TicketNum = 100;
    Demo d = new Demo();
    public void run(){
        sell();
    }
    public void sell(){
        synchronized(d){
            while(TicketNum>0){
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println("现在我也不会处理啊，随便写写吧");
                }
                System.out.println(TicketNum--);
            }
        }
    }
}
class TicketDemo15_16_17{
    public static void main(String[] args){
        Window w0 = new Window();
        Thread t0 = new Thread(w0);
        Thread t1 = new Thread(w0);
        Thread t2 = new Thread(w0);
        t0.start();
        t1.start();
        t2.start();
    }
}