import java.util.Arrays;

class Demo19_17{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
    }
    //Arrays类中toString方法
    public static String myToString(int[] a){
        if(a==null)
            return "null";
        int iMax = a.length-1;
        if(iMax==-1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(int i=0;;i++){
            b.append(a[i]);
            if(i==iMax)
                return b.append("]").toString();
            b.append(", ");
        }
    }
}