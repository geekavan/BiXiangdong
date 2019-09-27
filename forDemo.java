class forDemo{
    public static void main(String[] args){
        /*
        for(初始表达式；条件表达式；每次循环后执行的表达式){
            循环体；
        }
        */
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
        //上边是我们常见的一种for语句的写法，但是下面这一种也是可以的，但是有一定基础的同学可能会认为并不正确
        int i = 0;
        for(System.out.println("初始表达式");i<3;System.out.println("每次循环后执行的表达式")){
            System.out.println("循环体");
            i++;
        }
    }
}
/*
 $ java forDemo
0
1
2
初始表达式
循环体
每次循环后执行的表达式
循环体
每次循环后执行的表达式
循环体
每次循环后执行的表达式 
 */