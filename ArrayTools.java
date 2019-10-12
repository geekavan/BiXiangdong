/**
* 数组工具类，包含：求数组最大值、选择排序、打印数组功能
* @author geekavan
* @version v1.0
*/
public class ArrayTools{
    private ArrayTools(){}
    /**
     * 求数组最大值
     * @param arr 输入int[]类型数组
     * @return 该数组的最大值int类型
    */
    public static int getMax(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex])
                maxIndex = i;
        }
        return arr[maxIndex];
    }
    /**
     * 选择排序
     * @param arr 需要排序的数组int[]类型
    */
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
    /**
     * 打印数组
     * @param arr 需要打印的数组int[]类型
    */
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
        System.out.print('\n');
    }
}