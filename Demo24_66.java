import java.io.UnsupportedEncodingException;

class Demo24_66 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码过程
        byte[] buf = "你好".getBytes("gbk");

        //解码过程
        String s = new String(buf,"gbk");
        System.out.println(s);
    }
}