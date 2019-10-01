class OneNumbersTest{
    public static void main(String[] args){
        System.out.println(checkOneNumbers(0x12481249));
    }
    public static int checkOneNumbers(int x){
        int oneNumbers = 0;
        while(x!=0){
            oneNumbers++;
            x = x&(x-1);
        }
        return oneNumbers;
    }
}