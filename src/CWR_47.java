class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void speak() {
        System.out.println(name + " makes a sound.");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    void bark() {
        System.out.println(name + " barks!");
    }
}
public class CWR_47 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy");
        dog1.speak();
        dog1.bark();
    }
}