class AException extends Exception{}
class BException extends AException{}
class CException extends Exception{}
class Fu{
    void show()throws AException{}
}
class Zi extends Fu{
    void show()throws AException{}
}

class ExceptionDemo11_11{
    public static void main(String[] args){
        method(new Zi());
    }
    public static void method(Fu f){
        try{
            f.show();
        }
        catch(AException a){
        }
        finally{}
    }
}