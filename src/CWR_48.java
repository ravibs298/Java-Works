class Plant {
    void grow() {
        System.out.println("Plant is growing...");
    }
}
class Tree extends Plant {
    void provideShade() {
        System.out.println("Tree provides shade.");
    }
}
class MangoTree extends Tree {
    void produceFruit() {
        System.out.println("Mango tree produces sweet mangoes.");
    }
}
public class CWR_48 {
    public static void main(String[] args) {
        MangoTree mango = new MangoTree();
        mango.grow();
        mango.provideShade();
        mango.produceFruit();
    }
}
