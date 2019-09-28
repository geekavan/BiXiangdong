class ForFor99_04_01_04{
    public static void main(String[] args){
        /*
         九九乘法表
         1*1=1
         1*2=2 2*2=4
         1*3=3 2*3=6 3*3=9
         */
        for(int i=0;i<9;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print((j+1)+"*"+(i+1)+"="+((j+1)*(i+1)));
                System.out.print(' ');
            }
            System.out.print('\n');

        }
    }
}