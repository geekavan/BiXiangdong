class Demo16_04{
    public static void main(String[] agrs){
        int num1 = 1;
        Integer inum1 = num1;//自动装箱Integer inum1 = Integer.valueOf(num1);

        Integer inum2 = 2;//自动装箱Integer inum2 = Integer.valueOf(2);
        int num2 = inum2;//自动拆箱int num2 = inum2.intValue(inum2);
    }
}