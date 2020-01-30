import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Demo24_56 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream(new File("f:\\obj.txt")));
        Person p =(Person)oos.readObject();
        String name = p.getName();
        int age = p.getAge();
        System.out.println(name+"......"+age);
        oos.close();
    }
}
class Person implements Serializable{
    public String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}