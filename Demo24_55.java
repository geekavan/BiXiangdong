import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo24_55 {
    public static void main(String[] args) throws IOException{
        writeObj();
    }

    public static void writeObj() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("f:\\obj.txt")));
        oos.writeObject(new Person("xiaoqiang",13));
        oos.close();
    }
}

class Person implements Serializable{
    private String name;
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
