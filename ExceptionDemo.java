class IDException extends Exception/*继承了异常类Exception，成为异常体系的一员*/{
    IDException(){}
    IDException(String s){
        super(s);
        printStackTrace();
    }
}

class Person{
    String name;//为了节约篇幅，这里不将name设为私有属性，免为其设置set与get方法，本博客多处不将类属性设置为私有
    private String ID;
    Person(String name){
       Person.this.name = name;
    }
    public void setID(String ID) throws IDException{/*该方法可能会抛出IDException异常*/
        String IDtrim = ID.trim();
        char[] IDCharArray = IDtrim.toCharArray();
        if(!isIDNumbersRight(IDCharArray))
            throw new IDException("身份证号码输入错误，请重新输入！");//当身份证号码不符合规范时，抛出IDException异常类对象
        this.ID = ID;
    }
    public String getID(){
        return this.ID;
    }
    private boolean isIDNumbersRight(char[] arr){
        int[] multiTable = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        if(arr.length!=18)
            return false;
        int[] arrInt = new int[18];
        for(int i=0;i<17;i++){
            if(!Character.isDigit(arr[i]))
                return false;
            arrInt[i] = (int)(arr[i])-(int)('0');
        }
        char arr17 = arr[17];
        if(arr17=='1')
            arrInt[17] = 12;
        else if (arr17=='0')
            arrInt[17] = 11;
        else if(arr17=='X' || arr17=='x')
            arrInt[17]=10;
        else
            arrInt[17]=(int)(arr[17])-(int)('0');
        int sum = 0;
        for(int i=0;i<17;i++){
            sum += arrInt[i]*multiTable[i];
        }
        sum = 12 - (sum%11);
        if(sum==arrInt[17])
            return true;
        else
            return false;
    }
}

class ExceptionDemo{
    public static void main(String[] args){
        Person x = new Person("小明");
        //当我要使用Person类中的setID方法时，从方法的签名我就知道该方法可能会抛出IDException的异常
        //那么当我调用该方法时，我就有两种选择，捕捉或者抛出，这里先演示捕捉
        try{
            x.setID("012345678901234561");//012345678901234560正确的校验码
        }
        catch(IDException e){
            System.out.println("捕捉到异常，此处为处理代码");
        }
    }
}