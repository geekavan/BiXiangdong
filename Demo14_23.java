class Resource{
    private String name;
    private String sex;
    public void set(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
    public void out(){
        System.out.println(Thread.currentThread().getName()+"......"+name+"......."+sex);
    }
}
class Input implements Runnable{
    Resource r;
    public void run(){

    }
}