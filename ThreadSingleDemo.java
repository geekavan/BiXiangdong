/**
 * 单例模式_饿汉式
 */
// class Single{
//     private static final Single s = new Single();
//     private Single(){}
//     public static Single getInstance(){
//         return s;
//     }
// }

/**
 * 单例模式_懒汉式
 */
// class Single{
//     private static Single s = null;
//     private Single(){}
//     public static Single getInstance(){
//         if(s==null)
//             s = new Single();
//         return s;
//     }
// }

/*显然懒汉式是线程不安全的，当线程0进入if代码块内部之后线程1获得cpu的执行权也进入if代码块的内部，
随后线程0新建立了一个对象并赋值给成员变量s，线程1随后又会再建立一个对象并赋值给成员变量s，这就不是
单例设计模式了，因为这就有多个实例了
*/

//更改为:

// class Single{
//     private static Single s = null;
//     private Single(){}
//     public synchronized static Single getInstance(){
//         if(s==null)
//             s = new Single();
//         return s;
//     }
// }

//这样是线程安全的，但是每调用一次getInstance方法就会判断一次锁效率不高

class Single{
    private static Single s = null;
    private Single(){}
    public static Single getInstance(){
        if(s==null){
            synchronized(Single.class){
                if(s==null)
                    s = new Single();
            }
        }
        return s;
    }
}

//这样就不用每次调用都判断锁了，效率比较高