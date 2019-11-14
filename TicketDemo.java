class Window extends Thread{
    private static int TicketNum = 100;
    public void run(){
        sell();
    }
    public void sell(){
        while(TicketNum>0){
            System.out.println(TicketNum--);
        }
    }
}
class TicketDemo{
    public static void main(String[] args){
        Window w0 = new Window();
        Window w1 = new Window();
        Window w2 = new Window();
        w0.start();
        w1.start();
        w2.start();
    }
}