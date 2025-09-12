import java.util.Scanner;
public class CWR_63 {
    static int linearsearch(int arr[], int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1;
        }
        return linearsearch(arr, size - 1, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter element to search: ");
        int key = sc.nextInt();

        int index = linearsearch(arr, arr.length, key);
        if (index != -1) {
            System.out.println("element is present at index " + index);
        } else {
            System.out.println("element is not present in array");
        }
        sc.close();
    }
}