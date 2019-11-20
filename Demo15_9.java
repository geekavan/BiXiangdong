class Demo15_9{
    public static void main(String[] args){
        String[] s = {"nba","abc", "cba", "zz", "qq","haha"};
        selectedSort(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void selectedSort(String[] args){
        if(args==null || args.length==0)
            return;
        int index = 0;
        for(int i=0;i<args.length;i++){
            index = i;
            for(int j=i;j<args.length;j++){
                if(args[j].compareTo(args[index])<0)
                    index = j;
            }
            swap(args,i,index);
        }
    }
    public static void swap(String[] args, int i, int j){
        String temp = args[i];
        args[i] = args[j];
        args[j] = temp;
    }
}