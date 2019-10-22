class Fu{
    String name="Fu";
}
class Zi extends Fu{
    String name="Zi";

}
class DuoTaiDemo2{
    public static void main(String[] args){
        Fu f = new Zi();
        System.out.println(f.name);
    }
}