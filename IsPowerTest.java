class IsPowerTest{
    public static void main(String[] args){
        System.out.print(isPower(4096));

    }
    public static boolean isPower(int x){
        if(x<=0)
            return false;
        else{
            while(x!=0){
                if(((x&1)==1) && (x/2 == 0))
                    return true;
                else if (((x&1)==1) && (x/2 != 0))
                    return false;
                x = x>>1;
            }
        }
        return false;
    }
}