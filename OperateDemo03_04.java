class OperateDemo03_04{
    public static void main(String[] args){
        Integer a = -2147483647;
        System.out.println(Integer.toBinaryString(a));
        System.out.println("a = "+a);
        System.out.println(Integer.toBinaryString(a>>1));
        System.out.println("a>>1 = "+(a>>1));
        System.out.println(Integer.toBinaryString(a>>>1));
        System.out.println("a>>>1 = "+(a>>>1));
    }
}
/*
$ java OperateDemo03_04
10000000000000000000000000000001
a = -2147483647
11000000000000000000000000000000
a>>1 = -1073741824
1000000000000000000000000000000   //最开头有一位0，给省略了
a>>>1 = 1073741824
 */