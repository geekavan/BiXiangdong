class Demo12_4_01_09{
    public static void main(String[] args){
        Zi.show(4);
    }
}
class Fu{
    static void show(int a){
        System.out.println("int");
    }
}
class Zi extends Fu{
    static void show(double a){
        System.out.println("double");
    }

}