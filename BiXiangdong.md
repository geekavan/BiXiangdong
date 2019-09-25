# 02_01 关键字
Java 严格区分大小写

一般关键字小写，类名大写
# 02_02 标识符
标识符：自己起的一些名称(变量名、函数名、类名等)

组成：26个英文字母，数字0-9，**符号_$**

注意：

1.数字不可以开头

2.不可以使用关键字做标识符
# 02_11_13 自动类型提升与强制转换、类型运算细节
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

2.byte b = 3;在编译的时候，**编译器会判断int类型的3在不在byte所表示的范围之内**，在则进行一次**强制类型转换**，将int类型的3转换为byte类型存储在变量b中，不在则报错。

3.b = b + 4;表达式b + 4中b为byte类型的变量，在与int类型的4相加时会进行**自动类型提升**，将byte类型的b提升为int类型，结果为int类型，但是需要注意的一点是b为变量，也就是说它存储的数值是在变化的，所以说**编译器无法判断int类型的b+4在不在byte所表示的范围之内**，所以报错。

```java
class VarDemo2{
    public static void main(String[] args){
        byte b;
        b = 3 + 4;
        System.out.println(b);
    }
}
```
这里就不会报错(因为3+4在byte可以表示的范围之内)，因为3+4中int类型的3和int类型的4都是常量，编译器可以判断其结果在不在byte可以表示的范围之内，在则进行强制转换，将int类型转换为byte类型，不在则报错。

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
这里(b+4)为int类型，赋值给int类型的变量c程序就可以正常运行了

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
这里将(b+4)进行了强制转换，将int类型转换为byte类型，损失了精度。

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
因为s+=4;**底层做了强制类型转换**，就相当于s = (short)(s + 4);

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

int temp = 3;

a = a + 1；

boolean b = temp > 3;
### 异或运算
一个数与另一个数异或偶数次，还等于原来那个数，如：
b ^ 3 ^ 3 = b

这个小知识点非常重要，因为有面试题会让你编写程序，找出一段数字里只出现过一次的数字(其他数字都出现过两次)等类似的题，就可以用该知识点来做

另外一个好玩的事情为，该小知识点可以用来加密，比如说用来加密图片(当然现实中没谁会用它来加密图片),这是毕老师提到的一点，我利用matlab(因为用Java写就没那么简单了/笑哭脸)写了一段程序大家可以感受一下
```matlab
>> img = imread('nv_xing.jpg');
>> img_encrypted = bitxor(img, 3);
>> imwrite(img_encrypted, 'nv_xing_encrypted.jpg');
```
![nv_xing_encrypted.jpg](https://github.com/geekavan/BiXiangdong/blob/master/nv_xing_encrypted.jpg)
大家猜到她是谁了吗？

答案揭晓
```matlab
>> img = imread('nv_xing_encrypted.jpg');
>> img_decrypt = bitxor(img, 125);
>> imwrite(img_encrypted, 'nv_xing_decrypt.jpg');
```