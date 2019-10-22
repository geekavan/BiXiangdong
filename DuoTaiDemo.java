class 毕姥爷{
    void 讲课(){
        System.out.println("管理");
    }
    void 钓鱼(){
        System.out.println("钓鱼");
    }
}
class 毕老师 extends 毕姥爷{
    void 讲课(){
        System.out.println("讲课");
    }
    void 看电影(){
        System.out.println("看电影");
    }
}
class DuoTaiDemo{
    public static void main(String[] args){
        毕姥爷 b = new 毕老师();//向上转型，使得屏蔽了子类(或实现类)的特有方法
        b.讲课();//但是至始至终堆内存中只有一个对象毕老师，所以调用的是毕老师的讲课方法
        b.钓鱼();
        //b.看电影();//毕老师已经化妆成为毕姥爷，根本没有看电影方法
        /*
        $ javac -encoding utf-8 DuoTaiDemo.java 
        DuoTaiDemo.java:22: 错误: 找不到符号
                b.看电影();
                 ^
        符号:   方法 看电影()
        位置: 类型为毕姥爷的变量 b
      1 个错误
        */
        毕老师 bb = (毕老师)b;//向下转型，使得可以调用子类(或实现类)的特有方法
        bb.看电影();
    }
}