# 02_01 关键字
Java 严格区分大小写

一般关键字小写，类名大写
# 02_02 标识符
标识符：自己起的一些名称(变量名、函数名、类名等)

组成：26个英文字母，数字0-9，**符号_$**

注意：

1.数字不可以开头

2.不可以使用关键字做标识符

# 02_08负数的进制
负数的二进制为该负数取绝对值的二进制取反再加一

如：-6

首先计算6的二进制00000000000000000000000000000110

取反&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11111111111111111111111111111001

加一&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11111111111111111111111111111010

即-6的二进制表示为11111111111111111111111111111010
```java
class Demo02_08{
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.toBinaryString(-6));
    }
/*
$ java Demo02_08
110                      //前面的0都被省略了
11111111111111111111111111111010
*/
}
```
# 02_11_13 自动类型提升与强制转换、类型运算细节
注意，其实老师在教程中，"强制转换"用词有点不太严格，为了让"强制转换"这个词更加"专有化"，本笔记中将"类型转换的结果可能丢失精度"的转换称之为"强制转换"(或"强制类型转换")
```java
class VarDemo2{
    public static void main(String[] args){
        byte b = 3;
        b = b + 4;
        System.out.println(b);
    }
}
/*
$ javac VarDemo2.java 
VarDemo2.java:4: 错误: 不兼容的类型: 从int转换到byte可能会有损失
        b = b + 4;
              ^
1 个错误
*/
```
1.Java中整数的默认类型为int类型

2.byte b = 3;在编译的时候，**编译器会判断int类型的3在不在byte所表示的范围之内**，在则进行一次类型转换，将int类型的3转换为byte类型存储在变量b中(因为会进行是否丢失精度的判断，所以这里称之为类型转换，而非老师说的强制类型转换)，不在则报错。

3.b = b + 4;表达式b + 4中b为byte类型的变量，在与int类型的4相加时会进行**自动类型提升**，将byte类型的b提升为int类型，结果为int类型，我们要把int类型的结果b+4存储在byte类型b之中，这需要对int类型的值b+4做判断，但是需要注意的一点是b为变量，也就是说它存储的数值是在变化的，所以说**编译器无法判断int类型的b+4在不在byte所表示的范围之内**，所以报错。

```java
class VarDemo2{
    public static void main(String[] args){
        byte b;
        b = 3 + 4;
        System.out.println(b);
    }
}
```
这里就不会报错(因为3+4在byte可以表示的范围之内)，因为3+4中int类型的3和int类型的4都是常量，编译器可以判断其结果在不在byte可以表示的范围之内，在则进行类型转换(同理，这里会进行是否丢失精度的判断，所以称之为类型转换)，将int类型转换为byte类型，不在则报错。

我们可以将程序写为
```java
class VarDemo2{
    public static void main(String[] args){
        byte b = 3;
        int c = b + 4;
        System.out.println(c);
    }
}
```
这里(b+4)为int类型，赋值给int类型的变量c，类型兼容，程序可以正常运行

还可以写为
```java
class VarDemo2{
    public static void main(String[] args){
        byte b = 3;
        b = (byte)(b + 4);
        System.out.println(b);
    }
}
```
这里将(b+4)进行了**强制转换**(因为这个转换是将int类型强制转换为byte类型，可能会丢失精度)

# 02_14 算术运算符_1
```java
class OperateDemo{
    public static void main(String[] args){
        int b = 6370;
        b = 6370/1000*1000;
        System.out.println(b);
    }
}
/*
$ java OperateDemo
6000
*/
```
Java是强类型的语言,6370是int类型，1000也是int类型，那么两者运算完的结果也是int类型，java会将小数点舍去

# 02_15 算术运算符_2、赋值运算符
```java
class OperateDemo2{
    public static void main(String[] args){
        int a=3,b;
        b = a++;
        System.out.println("a="+a+",b="+b);
    }
}
/*
$ java OperateDemo2
a=4,b=3
*/
```
 b = a++;就相当于
 ```java
 int temp = a;//因为a参与了其他运算，内存会将a的值复制一份
 a = a + 1；//做到这里相当于等式右边a++步骤做完了
 b = temp;//将复制的a的值赋值给等式左边
 ```
 大家理解了上边这个例子之后下边这个例子就很好理解了
```java
 class OperateDemo3{
     public static void main(String[] args){
         int i=3;
         i = i++;
         System.out.println("i="+i);
     }
 }
 /*
 $ java OperateDemo3
i=3
 */
```

### 赋值运算符
s+=4;与s=s+4;一样吗？在Java的世界里是有区别的
```java
class OperateDemoFuZhi{
    public static void main(String[] args){
        short s=3;
        s+=4;
        System.out.println("s="+s);
    }
}
/*
$ java OperateDemoFuZhi
s=7
*/
```
而
```java
class OperateDemoFuZhi{
    public static void main(String[] args){
        short s=3;
        s = s + 4;
        System.out.println("s="+s);
    }
}
/*
$ javac OperateDemoFuZhi.java 
OperateDemoFuZhi.java:4: 错误: 不兼容的类型: 从int转换到short可能会有损失
        s = s + 4;
              ^
1 个错误
*/
```
因为s+=4;底层做了**强制类型转换**，就相当于s = (short)(s + 4);

# 03_02_03 逻辑运算符、位运算符
& &nbsp;&& 的区别：

两者运算的结果是一致的，但是运算的过程有一点小区别(&还可以进行位运算)

    &运算符两边都进行计算

    &&运算符左边为false时，并不计算右边

| &nbsp;||的区别

两者运算的结果是一致的，但是运算的过程有一点小区别(| &nbsp;还可以进行位运算)

|运算符两边都进行计算

||运算符左边为true时，并不计算右边

```java
class OperateDemo0302{
    public static void main(String[] args){
        int a = 3;
        boolean b = (1>a) && (a++ > 4); 
        System.out.println("a="+a+",b="+b);
    }
}
/*
$ java OperateDemo0302
a=3,b=false
*/
```

```java
class OperateDemo0302{
    public static void main(String[] args){
        int a = 3;
        boolean b = (1>a) & (a++ > 4); 
        System.out.println("a="+a+",b="+b);
    }
}
/*
$ java OperateDemo0302
a=4,b=false
*/
```
从上边两段程序中，大家很容易看出两者的区别。

为了复习自加操作，我们有如下程序
```java
class OperateDemo0302{
    public static void main(String[] args){
        int a = 3;
        boolean b = a++ > 3; 
        System.out.println("a="+a+",b="+b);
    }
}
/*
$ java OperateDemo0302
a=4,b=false
*/
```
过程为：

int temp = a;

a = a + 1；

boolean b = temp > 3;
### 异或运算
一个数异或另一个数偶数次，还等于原来那个数，如：
b ^ 3 ^ 3 = b

1.这个小知识点非常重要，因为有面试题会让你编写程序，找出一段数字里只出现过一次的数字(其他数字都出现过两次)等类似的题，就可以用该知识点来做

2.还可以用来做两个变量的换值(不使用第三方变量，参见03_04_05_06节)

3.另外一个好玩的事情为，该小知识点可以用来加密，比如说用来加密图片(当然现实中没谁会用它来加密图片)，这是毕老师提到的一点，我利用matlab(因为用Java写就没那么简单了/笑哭脸)写了一段程序大家可以感受一下
```matlab
>> img = imread('nv_xing.jpg');
>> img_encrypted = bitxor(img, 125);
>> imwrite(img_encrypted, 'nv_xing_encrypted.jpg');
```
![nv_xing_encrypted.jpg](https://github.com/geekavan/BiXiangdong/blob/master/nv_xing_encrypted.jpg)

大家猜到她是谁了吗

答案揭晓
```matlab
>> img = imread('nv_xing_encrypted.jpg');
>> img_decrypt = bitxor(img, 125);
>> imwrite(img_decrypt, 'nv_xing_decrypt.jpg');
```
![nv_xing_decrypt.jpg](https://github.com/geekavan/BiXiangdong/blob/master/nv_xing_decrypt.jpg)

至于为什么解密后的图片中有许多彩色的小点呢，欢迎大家留言讨论

# 03_04_05_06位运算符
<<左移运算符相当于乘以2的次幂，>>右移运算符相当于除以2的次幂(右移的时候原来最高位为几，则补几，即符号位是不变的)，>>>无符号右移(右移的时候无论原来最高位为几，都补0)

```java
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
```
练习题1如何高效地计算2*8
```java
class OperateTest03_05{
    public static void main(String[] args){
        System.out.println(2<<3);
    }
}
/*
 $ java OperateTest03_05
16
 */
```
练习题2，在不使用第三方变量的情况下(答案里也写了利用第三方变量的形式)，怎么将两个变量互换

大家可以自己先思考一下，这个练习题是前几节一起学完后的练习题，不要受本节内容位运算符的影响
```java
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
        方式3，没有用到第三方变量，该种方式不推荐使用(开发面试的时候都不要使用)，因为如果c、d过大的话c=c+d就会超出int可表示的范围(并不推荐说成老师说的强制转换，因为这里虽然丢失了精度，但是没有涉及类型之间的转换)出现错误(但是程序是可以执行的哦)，这里第二行的输出语句表明c的值就是错的
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
```
# 03_22_23 for语句
```java
//注意以下程序如果编译出现问题，请使用javac -encoding utf-8 forDemo.java语句进行编译
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
```
下图为for语句中各个部分的执行顺序

初始表达式

**条件表达式**

————————————————————————————————————————————

循环体

每次循环后执行的表达式

**条件表达式**

————————————————————————————————————————————

循环体

每次循环后执行的表达式

**条件表达式**

也如下图所示

!["for语句中各个部分的执行顺序"](https://github.com/geekavan/BiXiangdong/blob/master/for%E8%AF%AD%E5%8F%A5%E6%89%A7%E8%A1%8C%E9%A1%BA%E5%BA%8F.png)


### while与for语句最简单的无限循环表现形式

while(true){}

for(;;;){}

for语句中如果条件表达式不写，默认为真

# 04_01_04For循环嵌套练习-99乘法表&转义字符
比较简单的一个小练习，大家在编写的时候，可以限制一下自己的用时
```java
class ForFor99_04_01_04{
    public static void main(String[] args){
        /*
         九九乘法表
         1*1=1
         1*2=2 2*2=4
         1*3=3 2*3=6 3*3=9
         */
        for(int i=0;i<9;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print((j+1)+"*"+(i+1)+"="+((j+1)*(i+1)));
                System.out.print(' ');
            }
            System.out.print('\n');

        }
    }
}
/*
$ java ForFor99_04_01_04
1*1=1 
1*2=2 2*2=4
1*3=3 2*3=6 3*3=9
1*4=4 2*4=8 3*4=12 4*4=16 
1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49 
1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
*/
```
从上边结果中，我们发现有几列是没有对齐的，我们想要对齐该怎么做呢？

这里要用到转义字符，顾名思义，可以用来转变字(母)符(号)含义的字符(串)

```java
class ForFor04_01_04{
    public static void main(String[] args){
        System.out.print("hello\tworld");
        System.out.println();
        System.out.print("hi\tworld");
    }
}
/*
$ java ForFor04_01_04
hello   world
hi      world
*/
```
上边用到了制表符\t，这个符号像画表格一样，将后边的字符串，放到了下一个格子里边，所以看起来就会对的整齐，大家可以自己动手更改一下99乘法表程序使之打印格式更加规整

其他(仅作为了解)：

\n换行(其实执行了两个步骤\n\r)

\r回车，将当前位置移动到本行开头

(其实这么说来，windows下的Enter键包含了两个步骤\n\r，这一点从Enter下的图标就可以看出来(图标先向下，再向左))

\t制表符

\b退格，将当前位置移动到前一列

因为这些并不是重点，所以本笔记不打算给出它们的演示，大家感兴趣的话可以自己编程试一下，看一下它们的作用效果

# 04_01_06break&continue
break用在循环结构中，跳出当前循环体(还可以用在swith语句中)

continue用在循环结构中，结束本次循环，继续下一次循环

下面给出几个例子，说明这两个关键字的作用，请同学注意了解一下**循环体的名称**，以及如何break或continue指定循环体

break跳出当前循环体
```java
class BreakContinueDemo{
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            if(i>1)
                break;
            System.out.println(i);
        }
    }
}
/*
$ java BreakContinueDemo
0
1
*/
```
break跳出指定循环体
```java
class BreakContinueDemo2{
    public static void main(String[] args){
        for1name:for(int i=0;i<3;i++){
            for2name:for(int j=0;j<6;j++){
                if(j>3)
                    break for1name;
                System.out.println("i="+i+",j="+j);
            }
        }
    }
}
/*
$ java BreakContinueDemo2
i=0,j=0
i=0,j=1
i=0,j=2
i=0,j=3
 */
```
continue类同，这里不再举例

# 04_03_04_05_06_07 堆栈
java虚拟机所管理的内存在数据运行时可划分为(本课程循序渐进，这里讲的并不细致，深入)

### 线程共享：

堆

方法区

### 线程私有：

程序计数器

虚拟机栈

本地方法栈

##### 其中堆的特点为：

1.几乎所有的类实例和数组都在堆上分配内存(其实数组也是对象)

2.每一个实例都有一个首地址

3.数组实例在创建时有初始化值，根据数组类型的不同而不同，整型为0，小数为0.0或0.f，boolean为false，char为'\u0000'

##### 其中栈的特点为：
1.局部变量存储在虚拟机栈中(局部变量表，jdk1.8后似乎有变化)

2.变量所属作用域一旦结束，该变量就自动释放

### 数组常见问题
```java
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
```

# 复习练习题(来源《Java程序员面试笔试宝典》)
1.如何判断一个数是否为2的n次方，大家可以自己动手练习一下

下面是我想的思路
```java
class isPowerTest{
    public static void main(String[] args){
        System.out.print(isPower(4096));

    }
    public static boolean isPower(int x){
        if(x<=0)
            return false;
        else{
            while(x!=0){
                if(((x&1)==1) && (x/2 == 0))
                    return true;
                else if (((x&1)==1) && (x/2 != 0))
                    return false;
                x = x>>1;
            }
        }
        return false;
    }
}
```

答案：一个数若为2的n次方，那么它的二进制中只有一个1，如00001000(一个int型在java中占据4个字节，这里只写了低八位)它如果减去1，那么为00000111(只写了低八位)，没有一位是同为1的，两者按位与等于0
```java
class IsPowerTest2{
    public static void main(String[] args){
        System.out.println(isPower(128));
    }
    public static boolean isPower(int x){
        if(x<=0)
            return false;
        else if((x&(x-1))==0)
            return true;
        return false;
    }
}
```

2.如何求二进制中1的个数
```java
class OneNumbersTest{
    public static void main(String[] args){
        System.out.println(checkOneNumbers(0x12481249));
    }
    public static int checkOneNumbers(int x){
        int oneNumbers = 0;
        while(x!=0){
            oneNumbers++;
            x = x&(x-1);
        }
        return oneNumbers;
    }
}
```

# 05_01Java数组的三种定义格式
```java
class ArrayDemo3{
    public static void main(String[] args){
        int[] arr0 = new int[3];
        int[] arr1 = new int[]{0,1,2};
        int[] arr2 = {0,1,2};
        print(arr0);
        print(arr1);
        print(arr2);
    }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print("\n");
    }
}
/*
$ java ArrayDemo3
[0,0,0]
[0,1,2]
[0,1,2]
*/
```
# 05_04_05常见排序算法
```java
class Sort{
    public static void main(String[] args){
        int[] arr =  {5,8,7,9,4,6,2,3,1,0};
        // int[] arr = {1};
        print(arr);
        // selectSort(arr);
        // bubbleSort(arr);
        // insertSort(arr);
        // shellSort(arr);
        mergeSort(arr);
        print(arr);
    }

    public static void exch(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");    
        System.out.print('\n');
    }

    public static void selectSort(int[] arr){
        if(arr==null)
            return; 
        int length = arr.length;
        for(int i = 0; i< length; i++){
            for(int j=i; j<length; j++){
                if(arr[i] > arr[j])
                    exch(arr, i, j);
            }
        }
    }
    
    public static void bubbleSort(int[] arr){
        if(arr==null)
            return;
        int length = arr.length;
        for(int i=0;i<length-1;length--){
            for(int j =0; j<length-1;j++){
            if(arr[j]>arr[j+1])
                exch(arr, j, j+1);
            }
        }
    }
    public static void insertSort(int[] arr){
        if(arr==null)
            return ;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=1 && arr[j]<arr[j-1];j--)
                exch(arr, j, j-1);
        }
    } 

    public static void shellSort(int[] arr){
        int step = arr.length;
        while(step!=0){
            for(int i = 0;i<arr.length;i+=step){
                for(int j=i;j>=step && arr[j]<arr[j-step];j-=step)
                    exch(arr, j, j-step);
            }
            step/=3;
        }
    }
    public static void merge(int[] arr, int lo, int mid, int hi){
        int i = lo;
        int j = mid+1;
        for(int k = lo;k<=hi;k++)
            temp[k] = arr[k];
            for(int k = lo;k<=hi;k++){
                if(i>mid)                  arr[k] = temp[j++];
                else if(j>hi)               arr[k] = temp[i++];
                else if(temp[i]<temp[j])    arr[k] = temp[i++];
                else                        arr[k] = temp[j++];
        }
    }
    public static void mergeSort(int[] arr, int lo, int hi){
        if(lo < hi){ 
            int mid = lo + (hi-lo)/2;
            mergeSort(arr, lo, mid);
            mergeSort(arr, mid+1, hi);
            merge(arr, lo, mid, hi);
        }
    }

    private static int[] temp;

    public static void mergeSort(int[] arr){
        temp = new int[arr.length]; 
        // 下边调用的mergeSort左右索引都包含了，以后归并就这么写吧
        mergeSort(arr, 0, arr.length-1);
    }
}
```



