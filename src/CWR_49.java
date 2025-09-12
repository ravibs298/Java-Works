abstract class Animal1 {
    public abstract void sound();
}
class Lion extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Lion roars: Roar!");
    }
}
class Tiger extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Tiger roars: Grrr!");
    }
}
public class CWR_49 {
    public static void main(String[] args) {
        Animal1 lion = new Lion();
        Animal1 tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}