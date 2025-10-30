import java.util.Scanner;
public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;
        int index = 0;
        for (int i = 0; i < count.length; i++)
            while (count[i]-- > 0) arr[index++] = i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        countingSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}