class Demo15_02{
    public static void main(String[] args){
        String s0 = "";
        String s1 = new String();
        System.out.println("s0==s1........."+(s0==s1));
        System.out.println("s0.equals(s1)......"+s0.equals(s1));

        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("s2==s3........."+(s2==s3));
        System.out.println("s2.equals(s3)......"+s2.equals(s3));

        char[] arr = {'a','b','c','1'};
        String s4 = new String(arr);
        System.out.println("s4......"+s4);

        String s5 = new String(arr,2,2);
        System.out.println("s5......"+s5);
    }
}