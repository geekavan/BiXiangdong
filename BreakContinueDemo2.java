class BreakContinueDemo2{
    public static void main(String[] args){
        for1name:for(int i=0;i<3;i++){
            for2name:for(int j=0;j<6;j++){
                if(j>3)
                    break for1name;
                System.out.println("i="+i+",j="+j);
            }
        }
    }
}
/*
$ java BreakContinueDemo2
i=0,j=0
i=0,j=1
i=0,j=2
i=0,j=3
 */