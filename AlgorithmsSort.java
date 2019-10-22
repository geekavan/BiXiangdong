class AlgorithmsSort{
    public static void exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static boolean less(Comparable i, Comparable j){
        return i.compareTo(j)<0;
    }
    public static boolean isSorted(Comparable[] a){
        for(int i=0;i<a.length-1;i++){
            if(!less(a[i],a[i+1]))
                return false;
        }
        return true;
    }
    public static void show(Comparable[] a){
        System.out.print("[");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+",");
        }
        System.out.println(a[a.length-1]+"]");
    }
    public static void selectSort(Comparable[] a){
        int minIndex;
        for(int i=0;i<a.length;i++){
            minIndex = i;
            for(int j=i;j<a.length;j++){
                if(!less(a[minIndex],a[j]))
                    minIndex = j;
            }
            exch(a, i, minIndex);
        }
    }
    public static void main(String[] args){
        // Integer[] arr = {9,8,7,6,3,2,5,4,1,10,11,12,13,15,14,19,17,18,16};
        // show(arr);
        // selectSort(arr);
        // assert isSorted(arr);
        // show(arr);

        Student[] s = new Student[7];
        s[0] = new Student("张十五", 15);        
        s[1] = new Student("李六五", 65);
        s[2] = new Student("王三七", 37);
        s[3] = new Student("赵八九", 89);
        s[4] = new Student("何四七", 47);        
        s[5] = new Student("余五五", 55);        
        s[6] = new Student("廖二三", 23);

        selectSort(s);

        showS(s);

    }
    public static void showS(Student[] s){
        for(int i=0;i<s.length;i++){
            if(i==(s.length-1)){
                System.out.print(s[i].getName()+":"+s[i].getGrade());
                continue;
                }
            System.out.print(s[i].getName()+":"+s[i].getGrade()+",");
        }
    }
}