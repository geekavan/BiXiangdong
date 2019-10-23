class Outer{
    private int num = 4;
    class Inner{
        public void show(){
            System.out.println("show run ..."+num);
        }
    }
}
class InnerClassDemo121{
    public static void main(String[] args){
        /*Outer.Inner指明是Outer类的内部类Inner类类型的引用变量，
        因为内部类Inner相当于外部类Outer的成员，所以要建立对象访问(因为非静态)，
        因为要访问的是Inner类的成员，所以也需要建立内部类Inner类的对象
        */
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}