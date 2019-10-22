class Fu{
    public void show(){
        System.out.println("Fu show");
    }
}
class Zi extends Fu{
    public void show(){
        System.out.println("Zi show");
    }
}
class DuoTaiDemo3{
    public static void main(String[] args){
        Fu f = new Zi();
        f.show();
    }
}