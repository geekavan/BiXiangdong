class Demo28_05_3{
    public static void main(String[] args){
        String str = "12345678901";
        String newStr = str.replaceAll("(\\d{4})\\d{4}(\\d{3})","$1****$2");
        System.out.println(newStr);
    }
}