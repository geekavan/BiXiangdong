class HalfSearch{
    public static void main(String[] args){
        int[] arr = {15,23,31,42,49,51,53,64,69,70,72,75,80,88,99};
        System.out.print(halfSearch(arr,42));
    }
    public static int halfSearch(int[] arr ,int key){
        int lo = 0;
        int hi = arr.length;
        int mid = lo + (hi-lo)/2;
        while(mid!=lo && mid!=hi){
            if(arr[mid]==key)
                return mid;
            if(arr[mid]<key)
                lo=mid;
            else
                hi=mid;
        mid = lo+(hi-lo)/2;
        }
        return -1;
    }
}