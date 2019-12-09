import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Demo19_16_3 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        AddSession1 addSession1 = new AddSession1(list);
        AddSession2 addSession2 = new AddSession2(list);

        Thread t1 = new Thread(addSession1);
        Thread t2 = new Thread(addSession2);

        t1.start();
        t2.start();

        try{Thread.sleep(100);}catch(Exception e){}

        for(int i = 0;i<list.size();i++)
            System.out.println("第"+i+"号索引元素"+list.get(i));
    }
}
class AddSession1 implements Runnable{
    private List<String> list;
    AddSession1(){}
    AddSession1(List<String> list){
        this.list = list;
    }
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            this.list.add(""+i);
            System.out.println("add"+i);
        }
    }
}
class AddSession2 implements Runnable{
    private List<String> list;
    AddSession2(){}
    AddSession2(List<String> list){
        this.list = list;
    }
    @Override
    public void run() {
        for(int i = 100;i<110;i++){
            this.list.add(""+i);
            System.out.println("add"+i);

        }
    }
}