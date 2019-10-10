class Person{
    private Person(){}
    private static Person p = null;
    public static Person getInstance(){
        if(p==null){
            p = new Person();
            return p;
        }
        else
            return p;
    }
}
class SingleDemo{
    public static void main(String[] args){
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1==p2);
    }
}