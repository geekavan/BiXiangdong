class ArrayToolsDemo1{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        System.out.println(arr[maxIndex]);
    }
}