interface CanFly {
    void fly();
}
interface CanSwim {
    void swim();
}
class Duck implements CanFly, CanSwim {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
    public void quack() {
        System.out.println("Duck is quacking.");
    }
}
public class CWR_46 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.quack();
    }
}