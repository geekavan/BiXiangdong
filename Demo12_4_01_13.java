class Demo12_4_01_13{
    public static void main(String[] args){
        try{
            showExce();
            System.out.println("A");
        }
        catch(Exception e){
            System.out.println("B");
        }
        finally{
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void showExce() throws Exception{
        throw new Exception();
    }
}