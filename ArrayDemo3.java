class ArrayDemo3{
    public static void main(String[] args){
        int[] arr0 = new int[3];
        int[] arr1 = new int[]{0,1,2};
        int[] arr2 = {0,1,2};
        print(arr0);
        print(arr1);
        print(arr2);
    }
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print("\n");
    }
}