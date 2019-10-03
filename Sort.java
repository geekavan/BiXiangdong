class Sort{
    public static void main(String[] args){
        int[] arr =  {5,8,7,9,4,6,2,3,1,0};
        // int[] arr = {1};
        print(arr);
        // selectSort(arr);
        // bubbleSort(arr);
        // insertSort(arr);
        // shellSort(arr);
        mergeSort(arr);
        print(arr);
    }

    public static void exch(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");    
        System.out.print('\n');
    }

    public static void selectSort(int[] arr){
        if(arr==null)
            return; 
        int length = arr.length;
        for(int i = 0; i< length; i++){
            for(int j=i; j<length; j++){
                if(arr[i] > arr[j])
                    exch(arr, i, j);
            }
        }
    }
    
    public static void bubbleSort(int[] arr){
        if(arr==null)
            return;
        int length = arr.length;
        for(int i=0;i<length-1;length--){
            for(int j =0; j<length-1;j++){
            if(arr[j]>arr[j+1])
                exch(arr, j, j+1);
            }
        }
    }
    public static void insertSort(int[] arr){
        if(arr==null)
            return ;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=1 && arr[j]<arr[j-1];j--)
                exch(arr, j, j-1);
        }
    } 

    public static void shellSort(int[] arr){
        int step = arr.length;
        while(step!=0){
            for(int i = 0;i<arr.length;i+=step){
                for(int j=i;j>=step && arr[j]<arr[j-step];j-=step)
                    exch(arr, j, j-step);
            }
            step/=3;
        }
    }
    public static void merge(int[] arr, int lo, int mid, int hi){
        int i = lo;
        int j = mid+1;
        for(int k = lo;k<=hi;k++)
            temp[k] = arr[k];
            for(int k = lo;k<=hi;k++){
                if(i>mid)                  arr[k] = temp[j++];
                else if(j>hi)               arr[k] = temp[i++];
                else if(temp[i]<temp[j])    arr[k] = temp[i++];
                else                        arr[k] = temp[j++];
        }
    }
    public static void mergeSort(int[] arr, int lo, int hi){
        if(lo < hi){ 
            int mid = lo + (hi-lo)/2;
            mergeSort(arr, lo, mid);
            mergeSort(arr, mid+1, hi);
            merge(arr, lo, mid, hi);
        }
    }

    private static int[] temp;

    public static void mergeSort(int[] arr){
        temp = new int[arr.length]; 
        // 下边调用的mergeSort左右索引都包含了，以后归并就这么写吧
        mergeSort(arr, 0, arr.length-1);
    }
}