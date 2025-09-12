import java.util.Scanner;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: "+ name + ", Age: " + age);
    }
}
public class CWR_24 {
    public static void main(String[] args) {
        Person person1 = new Person("Ravi", 20);
        Person person2 = new Person("Bhanu", 20);
        person1.display();
        person2.display();
    }
}
