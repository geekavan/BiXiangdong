class ArrayDemo{
    public static char[] chs = {'0','1','2','3',
                                '4','5','6','7',
                                '8','9','a','b',
                                'c','d','e','f'};
    public static void main(String[] args){
        toHex(60);
    }
    public static void toHex(int num){
        int index = 7;
        char[] hex = new char[8];
        while(num!=0){
            hex[index--]= chs[num&15];
            num = num>>>4;
        }
        for(int i = 0; i < 8;i++){
            System.out.print(hex[i]);
        }
    }
}