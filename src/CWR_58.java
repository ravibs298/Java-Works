import java.util.LinkedList;
import java.util.Scanner;

public class CWR_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.print("Enter the no. of elements: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + count + " elements:");
        for (int i = 0; i < count; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }
        System.out.print("\nEnter the element to find: ");
        String searchElement = sc.nextLine();
        int firstIndex = list.indexOf(searchElement);
        int lastIndex = list.lastIndexOf(searchElement);
        if (firstIndex == -1) {
            System.out.println("Element '" + searchElement + "' not found in the list.");
        } else if (firstIndex == lastIndex) {
            System.out.println("Element '" + searchElement + "' appears only once at position " + (firstIndex + 1));
        } else {
            int distance = lastIndex - firstIndex;
            System.out.println("Distance between first & last occurrence of '" + searchElement + "': " + distance);
            System.out.println("First occurrence at position: " + (firstIndex + 1));
            System.out.println("Last occurrence at position: " + (lastIndex + 1));
        }
        sc.close();
    }
}