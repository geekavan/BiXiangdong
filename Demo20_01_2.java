class Demo20_01_2{
    public static void main(String[] args){
        long currenttime = System.currentTimeMillis();
        System.out.println(currenttime);
        System.out.println(currenttime/1000/60/60/24/365);
        System.out.println(currenttime/(double)1000/60/60/24/365);
        System.out.println(currenttime/(double)1000/(60*60*24*365));
        System.out.println(currenttime/(double)(1000*60*60*24*365));
    }
}