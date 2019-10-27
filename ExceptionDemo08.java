public class ExceptionDemo08{
    public static void main(String[] args){
        int[] arr = new int[3];
        try{findNumber(arr, 3);}
        catch(FuShuIndexException e){
            System.out.println("负索引异常");
        }
        catch(IndexOutOfLengthExcepion e){
            System.out.println("索引越界异常");
        }
    }
    static int findNumber(int[] arr,int index) throws FuShuIndexException,IndexOutOfLengthExcepion{
        if(index<0){
            throw new FuShuIndexException("索引非法！索引不可以小于0");
        }
        if(index>=arr.length){
            throw new IndexOutOfLengthExcepion("索引非法！索引不可以大于或等于数组长度");
        }
        return arr[index];
    }
}
class FuShuIndexException extends RuntimeException{
    FuShuIndexException(String s){super(s);}
}
class IndexOutOfLengthExcepion extends RuntimeException{
    IndexOutOfLengthExcepion(String s){super(s);}
}

