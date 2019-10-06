class ConsDemo{
    public static void main(String[] args){
        Person p = new Person('f');
    }
}
class Person{
    private char sex;
    Person(char sex){
        this.sex = sex;
        return;
    }
}
/*
$ javac ConsDemo.java
*/