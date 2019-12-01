class Demo18_04{
    public static void main(String[] args){
        Tool t = new Tool("abc1");
        // Tool t = new Tool(4);
        String s = (String)t.getObject();
        System.out.println(s);
    }
}
class Tool{
    private Object obj;
    Tool(Object obj){
        this.obj = obj;
    }
    public void setObject(Object obj){
        this.obj = obj;
    }
    public Object getObject(){
        return this.obj;
    }
}