class Demo28_07{
    public static void main(String[] args){
        String str = "我我...我我..我我.我....我我.我要.要要..要.要要要.要....要.要学..学学.......学学..学...学.学....编编编.编....编程程程程";
        //去掉.
        str = str.replaceAll("\\.+","");
        str = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str);
    }
}