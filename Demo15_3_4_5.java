class Demo15_3_4_5{
    public static void main(String[] args){
        /**
         * 1.获取
         *      1.1获取字符串的长度
         *          int length();
         *      1.2获取指定index的字符
         *          char charAt(int index);
         *      1.3获取第一次出现某字符的位置
         *          从前向后看第一次出现
         *          int indexOf(int ch);
         *          int indexOf(int ch,int fromIndex);从指定index开始第一次出现的字符
         *          int indexOf(String str);
         *          int indexOf(String str,int fromIndex);
         * 
         *          从后向前看第一次出现
         *          int lastIndexOf(int ch);
         *          int lastIndexOf(int ch,int fromIndex);从指定index开始从后向前数的第一次出现的字符
         *          int lastIndexOf(String str);
         *          int lastIndexOf(String str,int fromIndex);
         *      1.4获取子串
         *          String substring(int beginIndex, int endIndex);
         *          String substring(int beginIndex);
         * 2.转换
         *      2.1将字符串变为字符串数组
         *          String[] split(String regex);涉及正则表达式
         *      2.2将字符串变为字节数组
         *          char[] toCharArray();
         *      2.3将字符串变为字节数组
         *          byte[] getBytes();
         *      2.4将字符串中的字母转变大小写
         *          String toUpperCase();
         *          String toLOwerCase();
         *      2.5将字符串中的内容进行替换
         *          String replace(char oldch,char newch);
         *          String replace(String s1,String s2);
         *      2.6将字符串两端的空格去除
         *          String trim();
         *      2.7将字符串进行连接
         *          String concat(String str);
         * 
         */

        String s0 = "张三,李四,王五";
        String[] arrS0 = s0.split(",");
        for(int i=0;i<arrS0.length;i++){
            System.out.println(arrS0[i]);
        }

        System.out.println("-------------------------");
        
        String s1 = "张三.李四.王五";
        String[] arrS1 = s1.split(".");
        for(int i=0;i<arrS1.length;i++){
            System.out.println(arrS1[i]);
        }
        System.out.println("over");
    }
}