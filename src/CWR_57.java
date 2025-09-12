import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CWR_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the no. of elements: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + count + " elements:");
        for (int i = 0; i < count; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }
        System.out.println("\nOriginal ArrayList: " + list);
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);
        sc.close();
    }
}