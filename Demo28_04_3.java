class Demo28_04_3{
    public static void main(String[] args){
        String str = "zhangsantttttttttttlisimmmmmmmmmmmmmmmwangwu";
        String regex = "(.)\\1+";
        String[] names = str.split(regex);
        for(String name:names){
            System.out.println(name);
        }
    }
}