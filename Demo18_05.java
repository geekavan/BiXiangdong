class Demo18_05{
    public static void main(String[] args){
        Tool<String> t = new Tool<String>();
        t.show("str");
    }
}
class Tool<BMW>{
    public void show(BMW bb){
        System.out.println("show"+bb.toString());
    }
}