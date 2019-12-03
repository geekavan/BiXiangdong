class MapDemo18_04_2{
    public static void main(String[] args){
        Outer.Inter oi = new Outer.Inter();
    }
}
    class Outer{
        static class Inter{
            void get(){}
        }
    }