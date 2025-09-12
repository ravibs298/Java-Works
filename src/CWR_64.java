import java.util.Scanner;
public class CWR_64 {
    static void insertion_sort(int[] arr){
        for (int i=1;i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr);
        System.out.println("sorted elements");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}