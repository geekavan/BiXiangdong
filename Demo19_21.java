class Demo19_21{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int sum = sum(arr);
        System.out.println("sum"+sum);

        int newSum = newSum(1,2,3,4,5,6);
        System.out.println("newSum......"+newSum);

    }
    public static int sum(int[] arr){
        if(arr==null)
            return 0;
        int iMax = arr.length-1;
        if(iMax==-1)
            return 0;
        int sum = 0;
        for(int i =0;i<=iMax;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int newSum(int... arr){
        if(arr==null)
            return 0;
        int iMax = arr.length-1;
        if(iMax==-1)
            return 0;
        int sum = 0;
        for(int i =0;i<=iMax;i++){
            sum+=arr[i];
        }
        return sum;
    }
}