class ExceptionDemo09{
    static void show(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
        if(index<0){
            throw new ArrayIndexOutOfBoundsException("越界啦!");
        }
    }
    public static void main(String[] args){
        int[] arr = new int[3];
        try{
            show(arr, -3);}
        catch(ArrayIndexOutOfBoundsException e){
            //处理代码
            System.out.println("catch");
            System.exit(0);
        }
        finally{
            System.out.println("finally");
        }
    }
}