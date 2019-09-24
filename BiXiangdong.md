# 0201 关键字
Java 严格区分大小写

一般关键字小写，类名大写
# 0202 标识符
标识符：自己起的一些名称（变量名、函数名、类名等）

组成：26个英文字母，数字0-9，**符号_$**

注意：

1.数字不可以开头

2.不可以使用关键字做标识符
# 0211自动类型提升与强制转换
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
b为byte类型，4为int类型，两者相加的时候会将b进行自动类型提升，提升为int类型，但是最后赋值给了byte类型的b就会丢失精度报错

可以改为
```java
class VarDemo2{
    public static void main(String[] args){
        byte b = 3;
        int c = b + 4;
        System.out.println(c);
    }
}
```
这里b+4的和为int类型，赋值给int类型的变量c程序就可以正常运行了

还可以改为
```java
class VarDemo2{
    public static void main(String[] args){
        byte b = 3;
        b = (byte)(b + 4);
        System.out.println(b);
    }
}
```
这里将（b+4）进行了强制转换，将int类型转换为byte类型，损失了精度。