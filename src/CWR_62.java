import java.util.Scanner;

public class CWR_62 {
    static int binarySearch(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);
            return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter element to search: ");
        int x = sc.nextInt();
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("element is not present in array");
        else
            System.out.println("element is present at index " + result);
    }
}
