class Window implements Runnable{
    private int TicketNum = 100;
    public void run(){
        sell();
    }
    public void sell(){
        Object obj = new Object();
        synchronized(obj){
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
class TicketDemo15_16_17_3{
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