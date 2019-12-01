class Demo18_04_2{
    public static void main(String[] args){
        Tool<String> t = new Tool<String>("abc1");
        String s = t.getObject();
        System.out.println(s);
    }
}
class Tool<BMW>{
    private BMW obj;
    Tool(BMW obj){
        this.obj = obj;
    }
    public void setObject(BMW obj){
        this.obj = obj;
    }
    public BMW getObject(){
        return this.obj;
    }
}