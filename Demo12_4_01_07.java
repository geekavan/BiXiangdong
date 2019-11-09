interface Inter{
    public void show(int a, int b);
    public void func();
}
class Demo12_4_01_07{
    public static void main(String[] args){
        //补足代码，调用两个函数，要求使用匿名内部类
        new Inter(){
            public void show(int a, int b){
                System.out.println(a+"......"+b);
            }
            public void func(){
                System.out.println("func run !");
            }
        }.show(1,2);
        new Inter(){
            public void show(int a, int b){
                System.out.println(a+"......"+b);
            }
            public void func(){
                System.out.println("func run !");
            }
        }.func();
    }
}