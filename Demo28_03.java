class Demo28_03{
    public static void main(String[] args){
        /**
         * 1.匹配
         * 2.应用的是String类中matches方法
         */
        String qq = "1234567890123456";
        String regex = "[1-9]\\d{5,15}";
        System.out.println(qq.matches(regex));
    }
}