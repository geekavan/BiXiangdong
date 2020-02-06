import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Demo28_06{
    public static void main(String[]args){
        String str = "da jia hao,ming tian bu fang jia";
        String regex = "\\b[a-z]{3}\\b";
        //将正则表达式封装成Pattern对象
        Pattern p = Pattern.compile(regex);
        //通过Pattern对象获取Matcher对象，并与字符串关联
        Matcher m = p.matcher(str);
        //调用Matcher方法对字符串进行操作
        while(m.find()){
            System.out.println(m.group());
        }
    }
}