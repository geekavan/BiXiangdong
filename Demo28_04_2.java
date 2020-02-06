class Demo28_04_2{
    public static void main(String[] args){
        String str = "zhangsan.lisi.wangwu";
        String regex = "\\.";
        String[] names = str.split(regex);
        for(String name:names){
            System.out.println(name);
        }
    }
}