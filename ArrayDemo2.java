class ArrayDemo2{
    public static void main(String[] args){
        int[] arr = new int[3];
        // System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        //可以正常编译，运行时产生错误

        // arr = null;
        // System.out.println(arr[3]);//NullPointerException
        //正常编译，运行时产生错误，空指针异常

        System.out.println(arr);//   [I@15db9742
        //其中@后边是这个对象的哈希值，根据这个哈希值给对象分配地址
        //@前边[代表arr指向为数组，I表示数组存储为int类型数据
        
    }
}