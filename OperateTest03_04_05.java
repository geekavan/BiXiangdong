class OperateTest03_04_05{
    public static void main(String[] args){
        /*
        方式1，利用第三方变量，开发的时候使用这个，因为阅读性强
        */
        int a = 4;
        int b = 3;
        System.out.println("a="+a+",b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a="+a+",b="+b);

        /*
        方式2，没有用到第三方变量，面试的时候使用，开发的时候一般不用，因为阅读性较差
        */
        int e = 4;
        int f = 3;
        System.out.println("e="+e+",f="+f);
        e = e ^ f;
        f = e ^ f;
        e = e ^ f;
        System.out.println("e="+e+",f="+f);
        
        /*
        方式3，没有用到第三方变量，该种方式不推荐使用(开发面试的时候都不要使用)，因为如果c、d过大的话c=c+d就会进行强制转换，出现错误，这里第二行的输出语句表明c的值就是错的
        */
        int c = 2147483647;
        int d = 3;
        System.out.println("c="+c+",d="+d);
        c = c + d;
        System.out.println("c="+c);
        d = c - d;
        c = c - d;
        System.out.println("c="+c+",d="+d);

    }
}