class ArrayTools{
    public static int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j] < arr[i])
                    swap(arr, i, j);
            }
        }
    }
    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print('\n');
    }
}
class ArrayToolsDemo4{
    public static void main(String[] args){
        int[] arr = {5,4,7,6,9,8,2,1,3,0};
        ArrayTools.print(arr);
        ArrayTools.selectSort(arr);
        ArrayTools.print(arr);
    }
}