* [02](#02)
    * [github中md编写注意事项](#github中md编写注意事项)
    * [关键字](#02_01关键字)
    * [标识符](#02_02标识符)
    * [负数的进制](#02_08负数的进制)
    * [自动类型提升与强制转换_类型运算细节](#02_11_13自动类型提升与强制转换_类型运算细节)
    * [算术运算符_1](#02_14算术运算符_1)
    * [算术运算符_2](#02_15算术运算符_2_赋值运算符)
    * [赋值运算符](#赋值运算符)
* [03](#03)
    * [逻辑运算符_位运算符](#03_02_03逻辑运算符_位运算符)
    * [异或运算](#异或运算)
    * [位运算符](#03_04_05_06位运算符)
    * [for语句](#03_22_23for语句)
    * [while与for语句最简单的无限循环表现形式](#while与for语句最简单的无限循环表现形式)
* [04](#04)
    * [For循环嵌套练习-99乘法表&转义字符](#04_01_04For循环嵌套练习-99乘法表_转义字符)
    * [break&continue](#04_01_06break_continue)
    * [堆栈](#04_03_04_05_06_07堆栈)
    * [数组常见问题](#数组常见问题)
* [复习练习题](#复习练习题来源Java程序员面试笔试宝典)
* [05](#05)
    * [Java数组的三种定义格式](#05_01Java数组的三种定义格式)
    * [常见排序算法](#05_04_05常见排序算法)
    * [折半查找](#05_09折半查找)
    * [进制的转换_查表法](#05_11_12进制的转换_查表法)
* [06](#06)
    * [成员变量和局部变量的区别](#06_08成员变量和局部变量的区别)
    * [private关键字](#06_14private关键字)
    * [python中的set与get方法](#python中的set与get方法)
* [07](#07)
    * [构造函数细节](#07_06构造函数细节)
    * [python为什么不支持函数重载](#python为什么不支持函数重载)
    * [this关键字](#07_07_08this关键字)
    * [static关键字特点及注意事项](#07_11_13static关键字特点及注意事项)
    * [成员变量和静态变量的区别](#07_12成员变量和静态变量的区别)
    * [static关键字_内存图解](#07_15static关键字_内存图解)
    * [静态代码块_构造代码块_局部代码块](#07_17_18静态代码块_构造代码块_局部代码块)
* [08](#08)
    * [单例设计模式](#08_04_06单例设计模式)
    * [数组工具类中静态的使用_文档的使用](#08_02_03数组工具类中静态的使用_文档的使用)
        * [阶段一____](#阶段一____)
        * [阶段二____函数](#阶段二____函数)
        * [阶段三____类](#阶段三____类)
        * [阶段四____静态](#阶段四____静态)
        * [阶段五____私有化构造函数](#阶段五____私有化构造函数)
        * [阶段六____文档的使用](#阶段六____文档的使用)
    * [Java中的单继承](#08_08Java中的单继承)
    * [子父类中的成员变量特点及内存图解](#08_10_11子父类中的成员变量特点及内存图解)
    * [子父类中的成员函数特点](#08_12子父类中的成员函数特点)
* [09](#09)
    * [一个对象的实例化过程](#09_01_02_03一个对象的实例化过程)
    * [final关键字](#09_04final关键字)
    * [抽象类的特点和细节](#09_05_06_07抽象类的特点和细节)
    * [接口的定义与实现](#09_09_10接口的定义与实现)
        * [接口的定义](#09_09接口的定义)
        * [接口的实现](#09_10接口的实现)
    * [接口的多实现_接口之间的多继承](#09_11_12接口的多实现_接口之间的多继承)


# 02

# github中md编写注意事项

其中标题的编写格式为:

```java
    * [github中md编写注意事项](#github中md编写注意事项)
```

1.&nbsp;*与[]之间有一个空格

2.&nbsp;()中不允许有&nbsp;空格&nbsp;&&nbsp;、&nbsp;()&nbsp;《》&nbsp;等符号

3.&nbsp;()中#只是一个#号，与你要关联的几级标题没有关系，无论几级标题都只是一个#号

# 02_01关键字

Java 严格区分大小写

一般关键字小写，类名大写

# 02_02标识符

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

# 02_11_13自动类型提升与强制转换_类型运算细节

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

# 02_14算术运算符_1

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

# 02_15算术运算符_2_赋值运算符

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

# 03

# 03_02_03逻辑运算符_位运算符

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

# 03_22_23for语句

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
# 04

# 04_01_04For循环嵌套练习-99乘法表_转义字符

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

# 04_01_06break_continue

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

# 04_03_04_05_06_07堆栈

java虚拟机所管理的内存在数据运行时可划分为(本课程循序渐进，这里讲的并不细致，深入)

**线程共享**：

堆

方法区

**线程私有**：

程序计数器

虚拟机栈

本地方法栈

**其中堆的特点为**：

1.几乎所有的类实例和数组都在堆上分配内存(其实数组也是对象)

2.每一个实例都有一个首地址

3.数组实例在创建时有初始化值，根据数组类型的不同而不同，整型为0，小数为0.0或0.f，boolean为false，char为'\u0000'

**其中栈的特点为**：

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

# 复习练习题来源Java程序员面试笔试宝典

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

# 05

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

# 05_09折半查找

```java
class HalfSearch{
    public static void main(String[] args){
        int[] arr = {15,23,31,42,49,51,53,64,69,70,72,75,80,88,99};
        System.out.print(halfSearch(arr,42));
    }
    public static int halfSearch(int[] arr ,int key){
        int lo = 0;
        int hi = arr.length;
        int mid = lo + (hi-lo)/2;
        while(mid!=lo && mid!=hi){
            if(arr[mid]==key)
                return mid;
            if(arr[mid]<key)
                lo=mid;
            else
                hi=mid;
        mid = lo+(hi-lo)/2;
        }
        return -1;
    }
}
```

# 05_11_12进制的转换_查表法

给定一个数，输出它的十六进制

```java
class ArrayDemo{
    public static void main(String[] args){
        toHex(15);
    }
    public static void toHex(int num){
        int a= 15;
        String[] hex = new String[8];
        for(int i=0;i<8;i++){
            hex[i]= sign((num & a)>>(i*4));
            a = a<<4;
        }
        for(int i=7;i>=0;i--){
            System.out.print(hex[i]);
        }

    }
    public static String sign(int num){
        if(num<0 || num > 15)
            return "";
        else if(num >=0 && num <=9){
            return (""+num);
        }
        else if(num==10)
            return ("a");
        else if(num==11)
            return ("b");
        else if(num==12)
            return "c";
        else if(num==13)
            return "d";
        else if(num==14)
            return "e";
        else 
            return "f";
    }
}
```

其实这其中获取10-15的二进制表示可以使用查表法

```java
class ArrayDemo{
    public static char[] chs = {'0','1','2','3',
                                '4','5','6','7',
                                '8','9','a','b',
                                'c','d','e','f'};
    public static void main(String[] args){
        toHex(60);
    }
    public static void toHex(int num){
        int index = 7;
        char[] hex = new char[8];
        while(num!=0){
            hex[index--]= chs[num&15];
            num = num>>>4;
        }
        for(int i = 0; i < 8;i++){
            System.out.print(hex[i]);
        }
    }
}
/*
$ java ArrayDemo
      3c
*/
```

# 06

# 06_08成员变量和局部变量的区别

1.定义的位置不同

    成员变量定义在类中

    局部变量定义在函数(或局部代码块)中

2.存在的内存位置不同

    成员变量在所属类实例化后存在于堆中

    局部变量在所属函数加载后存在于虚拟机栈中

3.初始化不同

    成员变量在所属类实例化后就有初始化值，可以直接使用

    局部变量随着所属函数加载到栈而在栈中存在但并无初始化值，不可以直接使用

4.生存周期不同

    成员变量随着对象的创建而存在，随着对象的回收而消失

    局部变量随着函数的加载而存在，随着函数的弹栈而消失

下面两段程序是区别3的演示

```java
class Test06_08{
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
class Person{
    String name;
    int age;
}
/*
$ java Test06_08
null
0
*/
```

```java
class Test06_08{
    public static void main(String[] args){
        String name;
        int age;
        System.out.println(name);
        System.out.println(age);
    }
}
/*
$ javac Test06_08.java
Test06_08.java:16: 错误: 可能尚未初始化变量name
        System.out.println(name);
                           ^
Test06_08.java:17: 错误: 可能尚未初始化变量age
        System.out.println(age);
                           ^
2 个错误
 */
```

# 06_14private关键字

```java
class PersonDemo{
    public static void main(String[] args){
        Person p = new Person();
        p.age = -20;
        System.out.println(p.age);
    }
}
class Person{
    int age;
}
/*
$ java PersonDemo
-20
*/
```

但是一个人的年龄为负值是不符合常识的，出现这种情况的原因为age数据对外暴露，或者说我们没有对输入数据进行检查，改变方式为：

1.将age设置为private，类外不能对其进行直接访问

2.添加一种方法可以设置age值，但要对所赋的值进行合理性判断

更改为：

```java
class PersonDemo{
    public static void main(String[] args){
        Person p = new Person();
        p.setAge(-20);
        System.out.println(p.getAge());
    }
}
class Person{
    private int age;
    public void setAge(int ag){
        if(ag<=0 || age>=150)
            System.out.println("错误的数据");
        else
            age = ag;
    }
    public int getAge(){
        return age;
    }
}
/*
$ java PersonDemo
错误的数据
0
*/
```

因为age为private类型，类外访问不到所以一般会有get方法用来获取age

### python中的set与get方法

```python
class Person():
    def __init__(self):
        self.__age = 0
    @property
    def getAge(self):
        return self.__age
    @getAge.setter
    def setAge(self, ag):
        if ((ag<0) or (ag > 150)):
            print("错误的数据")
        else:
            self.__age = ag
p = Person()
p.setAge = -20
print(p.getAge)
'''
$ python PersonDemo.py
错误的数据
0
'''
```

一般地我们将上述程序写为

```python
class Person():
    def __init__(self):
        self.__age = 0
    @property
    def age(self):
        return self.__age
    @age.setter
    def age(self, ag): #其实这里ag的阅读性并不强，一般我们会把其写为age，相应地为了区分局部变量与成员变量会将ag<0写为self.__age<0，ag>150类同
        if ((ag<0) or (ag > 150)):
            print("错误的数据")
        else:
            self.__age = ag
p = Person()
p.age = -20
print(p.age)
'''
$ python PersonDemo.py
错误的数据
0
'''
```

即将setAge与getAge都写为age，从名称到操作都是像在和成员变量打交道一样

# 07

# 07_06构造函数细节

1.当类没有写构造函数时，编译器会为类自动生成一个空参数空函数体的构造函数

&nbsp;&nbsp;当类有写构造函数时，编译器就不会再自动生成构造函数了

示例如下：

```java
class ConsDemo{
    public static void main(String[] args){
        Person p = new Person();
    }
}
class Person{
    private char sex;
}
/*
$ javac ConsDemo.java
*/
```

```java
class ConsDemo{
    public static void main(String[] args){
        Person p = new Person();
    }
}
class Person{
    private char sex;
    Person(char sex){
        this.sex = sex;
    }
}
/*
$ javac ConsDemo.java
1 个错误

        Person p = new Person();
                   ^
  需要: char
  找到: 没有参数
  原因: 实际参数列表和形式参数列表长度不同
1 个错误
*/
```

2.构造函数中有return语句(可以省略不写)(注意Java函数中都有return语句，不论写与不写，程序执行到return语句时就会弹栈)

```java
class ConsDemo{
    public static void main(String[] args){
        Person p = new Person('f');
    }
}
class Person{
    private char sex;
    Person(char sex){
        this.sex = sex;
        return;
    }
}
/*
$ javac ConsDemo.java
*/
```

3.构造函数也可以重载

```java
class ConsDemo2{
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p.name+":"+p.sex+"|");
        Person p1 = new Person('f');
        System.out.println(p1.name+":"+p1.sex+"|");
        Person p2 = new Person("小明",'f');
        System.out.println(p2.name+":"+p2.sex+"|");
    }
}
class Person{
    String name;//为了减少代码量，我没有限定成员变量为private
    char sex;
    Person(){}
    Person(char sex){
        this.sex = sex;
    }
    Person(String name, char sex){
        this.name = name;
        this.sex = sex;
    }
}
/*
$ java ConsDemo2
null: |
null:f|
小明:f|
*/
```

其实这里老师并没有讲，我想在这里说明为什么python不支持函数重载

### python为什么不支持函数重载

首先我们要了解为什么java要支持函数重载

1.解决函数功能相同，但是函数参数类型不同的问题。比如同为add,两个int型相加和double型相加就不一样，如果不支持函数重载，那么同一个函数功能就要用不同的函数名，烂透了

2.解决函数目的相同，但是参数个数不一样的问题。比如孩子类，孩子一生下来(创建出来)有的就有名字，有的还没有来得及起名字，那么同为对象初始化，参数个数就不一样，不支持重载的话，就需要不同函数名字(其实这一点也可以通过默认参数来解决)，烂透了

那么python不支持函数重载那它又是怎么解决这些问题的呢？

1.python是动态语言，不需要去指定变量类型，自然没有1的问题

2.python支持默认参数(Java并不支持默认参数)，这样一定程度上就解决了问题2，比如上面的程序ConsDemo2，虽然有的构造函数没有指定name或者sex的值，但是如果不指定的话，它们也是存在默认值的，这样的话python也可以较完美地改写上述程序，如下：

```python
class Person:#当类没有父类时，类名后面的()可以省略
    def __init__(self, name="null", sex = ' '):
        # 注意这里的null为一个字符串，和Java中的null不是一回事，python中""与''都是表示字符串而Java中""是字符串而''是字符
        self.name = name
        self.sex = sex

if __name__=="__main__":
    p = Person()
    print(p.name+":"+p.sex+"|")
    p1 = Person(sex = 'f')
    print(p1.name+":"+p1.sex+"|")
    p2 = Person("小明",'f')
    print(p2.name+":"+p2.sex+"|")
'''
$ python ConsDemo2.py
null: |
null:f|
小明:f|
'''
```
总结：

1.python不支持函数重载的原因为：动态语言且支持默认参数

2.Java不支持默认参数的原因为：支持函数重载，没必要再支持默认参数

# 07_07_08this关键字

this关键字是所在函数所属对象的引用

```java
class ThisDemo{
    public static void main(String[] args){
        Person p = new Person("如花",30);
    }
}
class Person{
    String name;
    int age;
    Person(String name){
        this.name = name;
    }
    Person(String name, int age){
        this(name);//必须放在第一行
        this.age = age;
    }
}
```

![class__init__](https://github.com/geekavan/BiXiangdong/blob/master/class__init__.png)
注意这里p的赋值顺序和老师不一样，可能存在错误

# 07_11_13static关键字特点及注意事项

##### static关键字特点

1.static关键字是一个修饰符，用于修饰成员(成员变量与成员函数)

2.static修饰的成员被所有类对象共享

3.static修饰的成员可以由对象所调用，也可以由类名直接调用

4.static修饰的成员随着类的加载而存在，先于对象存在

```java
class Person{
    static String country;
    String name;
    System.out.println(country+":"+name);
    //上述语句补全为System.out.println(Person.country+":"+this.name);
}
```

其中虽然country可以由对象调用写为this.country，但是为了阅读性更好还是写为类名调用比较合适，表明它是静态成员变量

##### static注意事项

1.静态方法中不能访问非静态成员

这点很好理解，静态方法随着类的加载就已经存在了可以由类名直接调用，而此时对象还并不存在(而成员变量是封装在对象中的)

2.静态方法中不能使用this或super关键字

3.主函数是静态的

# 07_12成员变量和静态变量的区别

1.存在位置不同：

成员变量在所属类实例化后存在于堆中

静态变量在所属类被加载后存在于方法区(共享数据区)的静态区中

2.生存周期不同：

成员变量随着对象的创建而存在，随着对象的回收而消失

静态变量随着类的加载而存在，随着类的消失而消失(jvm结束类就消失了，其实类也是对象，jvm也会管理)

3.访问方式不同：

成员变量由对象访问

静态变量既可以由对象访问，又可以由类名访问

4.别名不同：

成员变量又叫实例变量

静态变量又叫类变量

# 07_15static关键字_内存图解

这一步部分很重要，建议看视频

# 07_17_18静态代码块_构造代码块_局部代码块

### 静态代码块

静态代码块：类中static修饰的代码块

作用：用于类的初始化

什么时候执行：类加载的时候执行，且执行一次

### 构造代码块

构造代码块：类中{}内的代码块

什么时候执行：创建对象的时候执行，创建一次对象就执行一次，且**先于构造函数执行**

### 局部代码块

局部代码块：方法中{}内的代码块

作用：用于限定局部变量的生存范围，节省内存空间

什么时候执行：方法中顺序执行

```java
class Person{

    {
        System.out.println("构造代码块 run");
    }
    Person(){
        System.out.println("构造函数 run");
    }
    static{
        System.out.println("静态代码块 run");
    }
    public void show(){
        System.out.println("show run");
        {
            System.out.println("局部代码块 run");
        }
    }
}
class StaticCodeDemo{
    public static void main(String[] args){
        new Person();
        new Person();
        new Person().show();
    }
}
/*
$ java StaticCodeDemo
静态代码块 run
构造代码块 run
构造函数 run
构造代码块 run
构造函数 run
构造代码块 run
构造函数 run
show run
局部代码块 run
*/
```

注意：

1.当程序中使用到某类的时候，这个类就加载到内存的方法区中，类只用加载一次，所以**静态代码块**只执行了一次

2.当创建对象时，**构造代码块**会在**构造函数**之前执行，创建一次对象就执行一次构造代码块及构造函数

3.**局部代码块**在方法中按函数语句顺序执行

# 08

# 08_04_06单例设计模式

何为单例设计模式？一个类只能有一个对象

如何做到呢？

1.首先类外应该不允许建立本类对象，否则的话就可能会有很多个对象，因为用户并不受我们控制，这一点要怎么实现呢？

    类外建立对象时一定会初始化，就相当于调用了类的构造函数，那么我们把构造函数私有化，类外不可以访问，类外不就不可以建立对象了吗

2.但是类外不能够建立对象的话，怎么使得程序会有一个对象呢？

    答案当然是在类内建立对象

3.那么外界怎么获取这个对象呢？

    1.类内提供一个方法，返回本类对象

    2.要注意此类在类外建立不了对象，只能通过类名访问该方法，所以该方法应该为静态

    3.静态方法只能访问静态成员变量，所以存储对象的类类型变量应该为静态变量

```java
class Person{
    private Person(){}
    private static Person p = new Person();//为什么是私有？和其他成员变量一样，为了可控，不被外界随意篡改，提供方法访问，在方法中对输入参数进行判断，符合要求则返回实例
    public static Person getInstance(){
        return p;
    }
}
class SingleDemo{
    public static void main(String[] args){
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1==p2);
    }
}
/*
$ java SingleDemo
true
*/
```

该方法中Person类只要一加载，堆中就存在Person对象，称之为饿汉式单例模式

```java
class Person{
    private Person(){}
    private static Person p = null;
    public static Person getInstance(){
        if(p==null){
            p = new Person();
            return p;
        }
        else
            return p;
    }
}
class SingleDemo{
    public static void main(String[] args){
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1==p2);
    }
}
/*
$ java SingleDemo
true
*/
```

该方式下，类加载时堆中并无Person对象，只有当getInstance()方法被调用时，对象才被建立，称之为懒汉式单例建立模式

# 08_02_03数组工具类中静态的使用_文档的使用

我将以一段程序几个阶段的演化来讲解此部分内容

### 阶段一____

```java
class ArrayToolsDemo1{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        System.out.println(arr[maxIndex]);
    }
}
/*
$ java ArrayToolsDemo1
9
*/
```

### 阶段二____函数

求数组最大值可能会经常用到，为了提高代码的复用性将其封装为函数

```java
class ArrayToolsDemo2{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        int max = max(arr);
        System.out.println(max);
    }

    public static int max(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
}
/*
$ java ArrayToolsDemo2
9
*/
```

### 阶段三____类

当有很多个关于数组的函数，一个较为好的代码管理办法是将其封装在一个数组工具类中，这样的话无论使用者要调用哪个关于数组的函数，只要找到这个数组工具类就可以了

```java
class ArrayTools{
    public int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    public void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[i])
                    swap(arr, i, j);
            }
        }
    }
    private void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print('\n');
    }
}
class ArrayToolsDemo3{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        ArrayTools tool = new ArrayTools();
        tool.print(arr);
        tool.selectSort(arr);
        tool.print(arr);
    }
}
/*
$ java ArrayToolsDemo3
[5,4,7,6,9,8,2,1,3,0]
[0,1,2,3,4,5,6,7,8,9]
*/
```

### 阶段四____静态

我们仔细观察程序不难发现，我们ArrayTools类中所有的函数只需要给定参数就可以正常运行，用不到类对象任何特有的数据，所以建立ArrayTools类的对象是无意义的，所有函数应该为静态，可以由类名直接访问

```java
class ArrayTools{
    public static int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[i])
                    swap(arr, i, j);
            }
        }
    }
    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print('\n');
    }
}
class ArrayToolsDemo4{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        ArrayTools.print(arr);
        ArrayTools.selectSort(arr);
        ArrayTools.print(arr);
    }
}
/*
$ java ArrayToolsDemo4
[5,4,7,6,9,8,2,1,3,0]
[0,1,2,3,4,5,6,7,8,9]
*/
```

### 阶段五____私有化构造函数

该类不需要建立对象就可以使用，但是使用者可能会建立对象来使用，这只会白白地浪费空间，为了防止这种情况将类的构造函数私有化，不允许类外建立对象。

```java
class ArrayTools{
    private ArrayTools(){}
    public static int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[i])
                    swap(arr, i, j);
            }
        }
    }
    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print('\n');
    }
}
class ArrayToolsDemo5{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        ArrayTools.print(arr);
        ArrayTools.selectSort(arr);
        ArrayTools.print(arr);
    }
}
/*
$ java ArrayToolsDemo5
[5,4,7,6,9,8,2,1,3,0]
[0,1,2,3,4,5,6,7,8,9]
*/
```

### 阶段六____文档的使用

这个类我要是分享给别人使用的话，测试类ArrayToolsDemo肯定不用分享给别人，从没听过下载qq还附带qq的测试程序的，所以我们要将类ArrayTools单独写在一个文件里，为了文件外能够访问该类，要改变该类的权限为public，同时还要写文档来说明这个类里边都有哪些东西可用以及它们该怎么用

```java
/**
* 数组工具类，包含：求数组最大值、选择排序、打印数组功能
* @author geekavan
* @version v1.0
*/
public class ArrayTools{
    private ArrayTools(){}
    /**
     * 求数组最大值
     * @param arr 输入int[]类型数组
     * @return 该数组的最大值
    */
    public static int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    /**
     * 选择排序
     * @param arr 需要排序的数组int[]类型
    */
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[i])
                    swap(arr, i, j);
            }
        }
    }
    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * 打印数组
     * @param arr 需要打印的数组int[]类型
    */
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print('\n');
    }
}
/*
javadoc -encoding utf-8 -d myhelp ArrayTools.java //javadoc命令用于生成文档-d myhelp表示生成的文档存在于myhelp文件夹下，使用时请打开myhelp文件夹下的index.html文件
正在加载源文件ArrayTools.java...
正在构造 Javadoc 信息...
正在创建目标目录: "myhelp\"
标准 Doclet 版本 1.8.0_201
正在构建所有程序包和类的树...
正在生成myhelp\ArrayTools.html...
正在生成myhelp\package-frame.html...
正在生成myhelp\package-summary.html...
正在生成myhelp\package-tree.html...
正在生成myhelp\constant-values.html...
正在构建所有程序包和类的索引...
正在生成myhelp\overview-tree.html...
正在生成myhelp\index-all.html...
正在生成myhelp\deprecated-list.html...
正在构建所有类的索引...
正在生成myhelp\allclasses-frame.html...
正在生成myhelp\allclasses-noframe.html...
正在生成myhelp\index.html...
正在生成myhelp\help-doc.html...
*/
```

```java
class ArrayToolsDemo6{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        ArrayTools.print(arr);
        ArrayTools.selectSort(arr);
        ArrayTools.print(arr);        
    }
}
/*
$ java ArrayToolsDemo6
[5,4,7,6,9,8,2,1,3,0]
[0,1,2,3,4,5,6,7,8,9]
*/
```


# 08_08Java中的单继承

单继承：一个类只有一个直接父类

多继承：一个类可以有多个直接父类

Java中只支持单继承，不支持多继承，但对C++中的多继承进行了改良

# 08_10_11子父类中的成员变量特点及内存图解

1.当类中成员变量和局部变量重名时，使用this关键字来区分

当子类成员和父类成员重名时，使用super关键字来区分

2.this关键字代表的是所属类的对象的引用

super关键字代表的是父类所在空间

接下来我们看一下下面这个函数的内存图解

```java
class ExtendsDemo{
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}
class Fu{
    String str = "fuStr";
}
class Zi extends Fu{
    String str = "ziStr";
    public void show(){
        System.out.println(this.str+"......"+super.str);
    }
}
```

1.当我们运行java ExtendsDemo这个命令时，就相当于执行ExtendsDemo.main()这个静态函数，所以说ExtendsDemo这个类先加载到内存(方法区)

2.随后该执行main函数，main函数入栈

3.用到了Zi类(指new Zi()语句)，Zi类有一个父类Fu，那么先将Fu加载到方法区，之后将子类Zi加载到方法区，子类Zi中有一个super指向父类Fu内存区

4.new关键字会在堆中开辟一片区域，建立Zi对象，在这一边区域中开辟两个小区域，一个用来储存Fu类中的成员变量str，其初始化为null，之后赋值为fuStr(如有构造代码块的话，赋值操作与构造代码块按语句先后顺序执行，两者都在构造函数之前执行)，之后调用Fu类构造函数；令一个用来存储Zi类中的成员变量str，其初始化为null，之后赋值为ziStr(如有构造代码块的话，赋值操作与构造代码块按语句先后顺序执行，两者都在构造函数之前执行)，之后调用Zi类构造函数

5.随后对象初始化完毕，将Zi对象的引用赋值给栈中的Zi类类型的变量z

6.调用子类的方法show，show方法进栈，根据show放里边的this在堆中查找Zi类型对象，输出this.str与super.str的值

7.show方法弹栈，main方法弹栈

# 08_12子父类中的成员函数特点

### 成员函数的覆盖

```java
class ExtendsDemo3{
    public static void main(String[] args){
        Zi z = new Zi();
        z.show1();
    }
}
class Fu{
    void show1(){
        System.out.println("Fu show run");
    }
}
class Zi extends Fu{
    void show2(){
        System.out.println("Zi show run");
    }
}
/* 
$ java ExtendsDemo3
Fu show run
*/
```

上述程序运行过程简写，如想看详细过程请参考__内存图解大综合__章节

1.ExtendsDemo3类加载到内存(方法区)

2.主函数main进栈

3.Fu类加载进内存

4.Zi类加载进内存，其super指向其父类Fu所在内存空间

5.堆内存中建立Zi类对象

6.在本类Zi中查找show1函数，本类没有

7.通过super在其父类中寻找show1函数，找到了，show1入栈

8.show1执行，show1弹栈

9.main弹栈

下面这段程序与上述程序的区别为下面这段程序的子父类成员函数名称都为show

```java
class ExtendsDemo3{
    public static void main(String[] args){
        Zi z = new Zi();
        z.show();
    }
}
class Fu{
    void show(){
        System.out.println("Fu show run");
    }
}
class Zi extends Fu{
    void show(){
        System.out.println("Zi show run");
    }
}
/* 
$ java ExtendsDemo3
Zi show run
*/
```

上述程序运行过程简写，如想看详细过程请参考__内存图解大综合__章节

1.ExtendsDemo3类加载到内存(方法区)

2.主函数main进栈

3.Fu类加载进内存

4.Zi类加载进内存，其super指向其父类Fu所在内存空间

5.堆内存中建立Zi类对象

6.在本类Zi中查找show函数，本类存在show函数，并不继续在其父类中寻找，show入栈

7.show执行，show弹栈

8.main弹栈

我们通过子类对象调用的都是子类的show方法，看起来父类的show方法就像被覆盖掉了一样，所以称之为覆盖，也称之为重写，覆写

# 09

# 09_01_02_03一个对象的实例化过程

一个对象实例化过程：

Person p = new Person();

1.JVM会读取指定目录下的Person.class文件并加载进内存，并先加载Person的父类(如果Person有直接父类的情况下)

2.在堆内存中开辟空间并分配地址

3.对对象进行默认初始化

4.执行子类Person的构造函数

5.在构造函数的第一行有一条默认的语句super();因此会先执行其父类的构造函数进行初始化

6.在父类初始化完毕后，再执行子类的显示初始化

7.执行子类的构造初始化

8.初始化完毕后，将地址值赋给引用变量

# 09_04final关键字

1.final关键字可以修饰类、方法、变量

2.final关键字修饰的类不可以不继承

3.final关键字不可以被覆盖

4.final修饰的变量不能被改变，成为常量，只能被赋值一次

    为什么要用final关键字修饰变量？
    在程序中如果一个数据是固定的，那么直接使用该数据就可以了，但是那样阅读性比较差，所以要给他起一个名字，又因为数据不可以改变，所以搞一个final关键字固定他

5.写法规范：所有字母均大写，多个单词的话中间使用下划线分隔

6.类中的常量一般是静态的，因为常量的话意味着所有对象的该值都一致，即该值被所有对象共享，所以为静态。

这里复习一下静态的特点：

    1.随着类的加载进入方法区的静态区中，优先于对象存在
    2.被该类的所有对象所共享
    3.可以由类名直接调用

# 09_05_06_07抽象类的特点和细节

抽象类的特点

    1.被abstract关键字修饰的类称为抽象类

    2.当函数没有方法体时，该函数就是抽象函数，只能被定义在抽象类中

    3.抽象类不能被实例化，因为即使有对象的话也不能调用其抽象方法

    4.抽象类的子类必须覆盖了抽象父类的所有抽象方法才能够成为一般类，不然也是一个抽象类

关于抽象类的五个问题：

1.抽象类有构造函数吗？

    有。虽然抽象类不能创建对象，但是其构造函数可以给子类对象初始化

2.抽象类里可以没有抽象方法吗？

    可以，但是很少见，为的就是不让其创建对象。ATW适配器类就是这种类

    一般地这种类中的方法有方法体，但是没有内容，如：

    class Demo(){
        void show()
        {}
        void print()
        {}
    }

3.abstract关键字不能和哪些关键字共存？

    private不行，因为抽象方法必须要由子类覆盖，而当该方法私有化之后子类不知道有该方法，也就不能够覆盖该方法

    static不行，因为static修饰之后意味着类名可以直接调用该方法，而该方法没有被覆盖前根本无方法体

    final不能，因为final修饰的方法不能被覆盖，而抽象方法又必须要被覆盖

4.抽象类和一般类的异同点？

    相同点：
    抽象类和一般类都是用来描述事物的，内部都定义了成员
    不同点：
    一般类有足够的信息描述事物，抽象类描述事物的信息不足
    一般类中不可以定义抽象方法，抽象类中即可以定义抽象方法，又可以定义非抽象方法
    一般类可以被实例化，抽象类不可以被实例化

# 09_09_10接口的定义与实现

### 09_09接口的定义

接口和抽象类很类似，只不过接口中的方法都是抽象的，不可以有非抽象方法；抽象类中既可以有抽象方法，又可以有非抽象方法

接口中成员的修饰符是固定的：

1.成员变量：public static final

2.成员函数：public abstract

不加的话编译器也会自动给你加上

```java
interface Demo{
    public static final NUM = 4;
    public abstract void show();
}
```

### 09_10接口的实现

类与类之间可以有继承关系，但是只能单继承；类与接口之间可以有实现关系；接口与接口之间可以有继承关系，并且接口支持多继承

接口不可以被实例化，只有当一个接口中的所有抽象方法均被其子类实现之后该子类才可以被实例化，否则该子类是一个抽象类

```java
interface Demo{
    public static final int NUM = 4;
    public abstract void show1();
    public abstract void show2();
}
class DemoImpl implements Demo{
    public void show1()
    {}
    public void show2()
    {}
}
class InterfaceDemo{
    public static void main(String[] args){
        DemoImpl d = new DemoImpl();
        System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo.NUM);
    }
}
/*
$ java InterfaceDemo
4
4
4
*/
```

### 09_11_12接口的多实现_接口之间的多继承

```java
interface A{
    public abstract void showA();
}
interface B{
    public abstract void showB();
}
interface C extends A,B/*接口的多继承*/{
    public abstract void showC();
}
class Demo implements A,B/*接口的多实现*/{
    public void showA()
    {}
    public void showB()
    {}
}
```

为什么接口可以实现多继承(也是接口可以多实现的原因)，而类不可以多继承？

1.因为类多继承的话可以会出现调用的不确定性，示例程序如下，如果有类C同时继承了类A与类B的话，那么类C对象调用show方法的时候是调用类A的show方法还是类B的show方法呢？所以java不支持多继承(其实有其他的解决方式，使得python等支持多继承)

```java
class A{
    void show(){
    }
}
class B{
    void show(){
    }
}
```

2.但是如果是接口的话就不会出现调用的不确定性，示例如下，如果有接口C同时继承了接口A与接口B，那么有类D实现了接口C，类D对象调用show方法的时候也根本不会出现调用的不确定性，他只会老老实实地调用类D中show的实现方法。

```java
interface A{
    void show();
}
interface B{
    void show();
}
```

概括：

接口的多继承与多实现并不会使程序出现调用的不确定性