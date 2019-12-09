import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Demo19_16_6 {
    public static void main(String[] args){
        List<String> list = Collections.synchronizedList(new MyArrayList<String>());

        new Thread(){
            @Override
            public void run() {
                for(int i = 0;i<10;i++){
                    list.add(""+i);
                    System.out.println("add"+i);
                }
            }
        }.start();

        
        new Thread(){
            @Override
            public void run() {
                for(int i = 100;i<110;i++){
                    list.add(""+i);
                    System.out.println("add"+i);
        
                }
            }
        }.start();

        try{Thread.sleep(1000);}catch(Exception e){}

        for(int i = 0;i<list.size();i++)
            System.out.println("第"+i+"号索引元素"+list.get(i));
    }
}
class MyArrayList<E> extends ArrayList<E>{
    private ArrayList<E> arrayList;
    MyArrayList(){
        arrayList = new ArrayList<E>();
    }
    public boolean add(E e){
        return arrayList.add(e);
    }
    public E get(int index){
        return arrayList.get(index);
    }
    public int size(){
        return arrayList.size();
    }
}