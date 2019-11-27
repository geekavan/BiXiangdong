class Demo16_02{
    public static void main(String[] args){
        //基本类型--->字符串，方式1
        int num1 = 1;
        String snum1 = num1+"";
        System.out.println("+\"\"方式......"+snum1);

        //基本类型--->字符串，方式2
        int num2 = 1;
        String snum2 = String.valueOf(num2);
        System.out.println("valueOf方式......"+snum2);

        //字符串--->基本类型
        String snum3 = "1";
        int num3 = Integer.parseInt(snum3);
        System.out.println("字符串--->基本类型......"+num3);


    }
}