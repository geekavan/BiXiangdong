import java.io.UnsupportedEncodingException;

class Demo24_66_3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码过程
        byte[] buf = "你好".getBytes("gbk");

        //解码解错了
        String s = new String(buf,"utf-8");
        System.out.println(s);

        //重新解
        byte[] bu = s.getBytes("utf-8");
        String ss = new String(bu,"gbk");
        System.out.println(ss);
    }
}