class IsPowerTest2{
    public static void main(String[] args){
        System.out.println(isPower(128));
    }
    public static boolean isPower(int x){
        if(x<=0)
            return false;
        else if((x&(x-1))==0)
            return true;
        return false;
    }
}