class Demo28_05_2{
    public static void main(String[] args){
        String str = "zhangsanttttttttlisimmmmmmmmmmmmwangwu";
        String newStr = str.replaceAll("(.)\\1+","$1");
        System.out.println(newStr);
    }
}