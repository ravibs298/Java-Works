import java.util.Arrays;
import java.util.Scanner;

public class CWR_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a +ve no. for the size of the array.");
            sc.close();
            return;
        }
        int[] number = new int[n];

        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            number[i] = sc.nextInt();
        }
        int smallest = number[0];
        int greatest = number[0];

        for (int i = 1; i < n; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
            if (number[i] > greatest) {
                greatest = number[i];
            }
        }
        System.out.println("Smallest no. in the array is: " + smallest);
        System.out.println("Greatest no. in the array is: " + greatest);
        sc.close();
    }
}