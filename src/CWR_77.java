import java.util.Scanner;
import java.util.Vector;
public class CWR_77 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        int searchElement = 30;
        int index = vector.indexOf(searchElement);

        if (index != -1) {
            System.out.println(searchElement + " found at index " + index);
        } else {
            System.out.println(searchElement + " not found in the vector");
        }
    }
}