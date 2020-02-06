class Demo28_03_01{
    public static void main(String[] args){
        String qq = "12345678901o4";
        boolean b = isQQ(qq);
        System.out.println(b);
    }

    private static boolean isQQ(String qq) {
        int length = qq.length();
        if(length>=5 && length<=15){
            if(!qq.startsWith("0")){
                try{
                    long l = Long.parseLong(qq);
                    return true;
                }
                catch(NumberFormatException e){
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}