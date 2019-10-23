class Outer{
    int num = 3;
    class Inner{
        int num = 4;
        void show(){
            int num = 5;
            System.out.println("num ..."+num);
            System.out.println("this.num ..."+this.num);
            System.out.println("Inner.this.num ..."+Inner.this.num);
            System.out.println("Outer.this.num ..."+Outer.this.num);
        }
    }
}
class InnerClassDemo13{
    public static void main(String[] args){
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}