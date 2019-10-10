class ExtendsDemo3{
    public static void main(String[] args){
        Zi z = new Zi();
        z.show1();
    }
}
class Fu{
    void show1(){
        System.out.println("Fu show run");
    }
}
class Zi extends Fu{
    void show2(){
        System.out.println("Zi show run");
    }
}
/* 
$ java ExtendsDemo3
Fu show run
*/