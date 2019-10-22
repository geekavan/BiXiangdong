class Fu{
    public static void show(){
        System.out.println("Fu show");
    }
}
class Zi extends Fu{
    public static void show(){
        System.out.println("Zi show");
    }
}
class DuoTaiDemo4{
    public static void main(String[] args){
        //Fu.show();
        //Zi.show();
        Fu f = new Zi();
        f.show();
    }
}