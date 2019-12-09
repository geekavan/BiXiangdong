import java.util.ArrayList;
import java.util.List;

class Demo19_16_5 {
    public static void main(String[] args){
        List<String> list = new MyArrayList<String>();

        AddSession2 addSession2 = new AddSession2(list);

        new Thread(){
            @Override
            public void run() {
                for(int i = 0;i<10;i++){
                    list.add(""+i);
                    System.out.println("add"+i);
                }
            }
        }.start();

        
        Thread t2 = new Thread(addSession2);

        t2.start();

        try{Thread.sleep(1000);}catch(Exception e){}

        for(int i = 0;i<list.size();i++)
            System.out.println("第"+i+"号索引元素"+list.get(i));
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
class MyArrayList<E> extends ArrayList<E>{
    private ArrayList<E> arrayList;
    MyArrayList(){
        arrayList = new ArrayList<E>();
    }
    public boolean add(E e){
        synchronized(this){
            return arrayList.add(e);
        }
    }
    public E get(int index){
        return arrayList.get(index);
    }
    public int size(){
        return arrayList.size();
    }
}